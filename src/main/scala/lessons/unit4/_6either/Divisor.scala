package lessons.unit4._6either

object Divisor extends App {
  def divide(p: (Int, Int))(q: (Int, Int)): Either[String, (Int, Int)] = {
    if (q._1 == 0 || p._1 == 0 || q._2 == 0) return Left("Zero divisor")

    if (q._1 > q._2 || p._1 > p._2) return Left("Invalid input")

    val res: (Int, Int) = (p._1 * q._2, p._2 * q._1)

    if (res._1 > res._2) return Left("Improper result")

    def gcd(a: (Int, Int)): Int = if (a._2 == 0) a._1 else gcd(a._2, a._1 % a._2)

    var res_g = gcd(res)

    if (res_g == 0) res_g = 1

    Right((res._1 / res_g, res._2 / res_g))

  }

  print(divide(4, 10)(5, 10))


}
