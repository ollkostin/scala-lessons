package lessons.unit4._2patternmatching

object Example extends App {

  def numberName(x: Int) = x match {
    case 1 | 5 => "one or five"
    case 2 => "two"
    case _ => "unknown"
  }

  def numberNameIf(x: Int) = x match {
    case 1 | 5 => "one or five"
    case x if x % 2 == 0 => "unknown even"
    case _ => "unknown"
  }

  def returnsUnknownFor2(x: Int) = x match {
    case 1 => "one"
    case _ => "unknown"
    case 2 => "two"
  }

  print(numberName(5))
  print(returnsUnknownFor2(2))
  print(numberNameIf(4))

  case class Address(country: String, city: String)

  def addressInfo(address: Address): String = address match {
    case Address("Russia", _) => "russian"
    case Address("Russia", "Moscow") => "russian capital"
    case Address("Japan", _) => "japanese"
    case Address(_, "Minsk") => "zhive belarus"
    case Address(country, _) => s"$country"
    case _ => "unknown"
  }

  def sum(xs: List[Int], start: Int = 0): Int = xs match {
    case List() => start
    case List(x, rest@_*) => sum(rest.toList, start + x)
  }

  val address = "\\w+, \\w+".r

  def regex(addr: Address): Boolean = address match {
    case address() => true
    case _ => false
  }

  combination()

  def combination() = {
    val regexx = "(Russia|Japan)".r

    def getInfo(address: Address): String = {
      address match {
        case Address(country@regexx(_), city) => s"$city, $country"
        case Address(_, _) => "unknown"
      }
    }
  }
}
