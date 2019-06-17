package lessons.unit4._2patternmatching

object PetMatcher extends App {

  case class Pet(name: String, says: String)

  val pet = Pet("Barsik", "1010011010")

  val catReg = "(meow|nya)".r
  val roboReg = "[0-1]+".r
  val kind = pet match {
    case Pet("Rex", _) => "dog"
    case Pet(_, catReg(says)) => "cat"
    case Pet(_, says@roboReg()) => "robot"
    case _ => "unknown"
  }
  println(kind)
}
