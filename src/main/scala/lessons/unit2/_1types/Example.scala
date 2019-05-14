package lessons.unit2._1types

object Example extends App {
  val message : Any = "Hello"

  val unit : Unit = message

  val double : Double = {
    val x = 1.0
    Math.acos(x)
  }

  println(double)

  print(message)
  print(unit)

// WILL NOT COMPILE
//  val x : AnyRef = 43
}
