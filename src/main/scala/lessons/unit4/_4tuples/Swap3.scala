package lessons.unit4._4tuples

/**
  * Swap3.
  *
  * @author Vladimir_Kostin
  */
object Swap3 extends App {
  def swap3(tuple: (Int, Int, Int)): (Int, Int, Int) = {
    (tuple._3, tuple._2, tuple._1)
  }
  print(swap3((1, 2, 3)) == (3, 2, 1))

}
