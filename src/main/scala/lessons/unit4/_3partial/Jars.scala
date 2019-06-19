package lessons.unit4._3partial

object Jars extends App {

  case class Jar(name: String, value: Int, price: Double)

  val jars = List(Jar("Морской синий 6л", 6, 3000), Jar("Огненно-красный 12л", 12, 5000))

  def innerDiscount(price: Double, percent: Double): Double = price * percent

  def discount: PartialFunction[Jar, String] = {
    case Jar(n, v, p) if v >= 5 && v <= 10 => n + " " + innerDiscount(p, 0.05)
    case Jar(n, v, p) if v > 10 && v < Double.PositiveInfinity => n + " " + innerDiscount(p, 0.1)
  }

  print(jars.collect(discount))

}
