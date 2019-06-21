package lessons.unit4._4tuples

object EuclidAlgorithm extends App {
  def euclid(a: Int, b: Int): (Int, Int) =
    if (b > a) euclid(b, a).swap
    else if (b == 0) (1, 0)
    else {
      val div = a / b
      val mod = a % b

      val (x, y) = euclid(b, mod)
      (y, x - div * y)
    }

  print(euclid(7, 4))
  print(euclid(4, 7))
}
