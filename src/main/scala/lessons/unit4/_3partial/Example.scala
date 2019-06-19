package lessons.unit4._3partial

object Example extends App {
  val divide10: PartialFunction[Int, Int] = {
    case 1 => 10
    case 2 => 5
    case 5 => 2
    case 10 => 1
  }

  println(divide10.isDefinedAt(2))

  println(divide10.isDefinedAt(3))

  println(divide10(2))
  //  print(divide10(3) // MatchError

  println(List.range(1, 10).collect(divide10))

  def isPositive(x: Double) = x > 0

  // log only for positive
  val log: PartialFunction[Double, Double] = {
    case x if x > 0 => Math.log(x)
  }




}
