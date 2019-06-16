package lessons.unit3._2functions


object Composition extends App {

  val mul3 = 3 * (_: Double)
  val pow2 = (x: Double) => x * x

//  compilation error
//  println((mul3 compose[Double] pow2 _) (5))
  println((mul3 andThen pow2) (5)) // (5 * 3)  ** 2 = 225
  println(pow2.compose(mul3)(5)) // (5 * 3) ** 2 = 225
  println((pow2.andThen[Double] _) (mul3)(5)) // (5**2) * 3 = 75

}
