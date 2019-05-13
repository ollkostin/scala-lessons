package lessons._2types

object Types {

  val x = 10 //evaluated one time

  def y = 3 //evaluated every time, when we call it

  lazy val z = 3 //evaluated no more than one time, but when we call it first time

  var v = "value"
  v = "new value"

}
