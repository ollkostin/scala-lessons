package lessons.unit4._5option


object Example extends App {
  var value: Option[Int] = Option(1)
  var some: Some[Int] = Some(1)
  var none = None

  def divide(x: Int, y: Int): Option[Int] = if (y == 0) None else Some(x / y)

  def getDivideResult(x: Int, y: Int): String =
    divide(x, y) match {
      case Some(d) => s"$x = $d * $y"
      case None => "null division"
    }

  def getDivideResultNoMatch(x: Int, y: Int): String =
    divide(x, y)
      .map(d => s"$x = $d * $y")
      .getOrElse("null division")

  print(getDivideResult(10, 0))
  print(getDivideResult(10, 2))

}
