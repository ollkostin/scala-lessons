package lessons.unit5._1collections

import scala.util.Random

object Sort extends App {
  val list = List(3, 4, 1, 5, 0)

  println(list.sorted)

  val randomList = List.fill(Random.nextInt(100))(Random.nextInt(1000))

  def merge(as: List[Int], bs: List[Int], acc: List[Int] = Nil): List[Int] = as match {
    case List() => acc.reverse ++ bs
    case a +: restA => bs match {
      case List() => acc.reverse ++ as
      case b +: restB =>
        if (a < b) merge(restA, bs, a :: acc)
        else merge(as, restB, b :: acc)
    }

  }

  println(merge(List(2, 5, 6), List(1, 4, 9)))

  def mergeSort(as: List[Int]): List[Int] = as match {
    case Nil | (_ :: Nil) => as
    case _ =>
      val (left, right) = as.splitAt(as.length / 2)
      val leftSorted = mergeSort(left)
      val rightSorted = mergeSort(right)
      merge(leftSorted, rightSorted)
  }

  println(mergeSort(list))
}
