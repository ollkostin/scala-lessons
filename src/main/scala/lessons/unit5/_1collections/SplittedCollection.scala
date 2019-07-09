package lessons.unit5._1collections

object SplittedCollection {
  val ints = List(0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0)

  def main(args: Array[String]) {
    val ints: List[Int] = SplittedCollection.ints
    val zeros: List[Int] = ints.filter(_ == 0)
    val ones: List[Int] = ints.filter(_ == 1)

    println(zeros.mkString(","))
    println(ones.mkString(","))
  }
}
