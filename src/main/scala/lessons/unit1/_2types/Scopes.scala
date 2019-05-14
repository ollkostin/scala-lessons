package lessons.unit1._2types

object Scopes extends App {

  val x = "a"

  {
    val x = "b"

    print(x) // prints b
  }
}
