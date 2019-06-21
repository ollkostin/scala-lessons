package lessons.unit4._4tuples

object Example extends App {
  val tuple = (1, 2, 3)

  def divMod(x: Int, y: Int): (Int, Int) = (x / y, x % y)

  //unpack
  val (div, mod) = divMod(17, 5)
  println(div)
  println(mod)

  val dm = divMod(17, 5)

  println(dm._1)
  println(dm._2)

  //pair
  val pair = "Moscow" -> 10
  println(pair)
  val swapped = pair.swap
  println(swapped)

}
