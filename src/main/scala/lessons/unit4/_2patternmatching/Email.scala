package lessons.unit4._2patternmatching


/**
  * Does not work on test #6
  */
object Email extends App {
  val input1 = List("oleg", "oleg@email.com", "7bdaf0a1be3", "a8af118b1a2", "28d74b7a3fe")
  val input2 = List("oleg oleg@email.com", "7bdaf0a1be3", "a8af118b1a2", "28d74b7a3fe")

  def getNameAndEmail(list : List[String]) : String = {
    val nameR = "[a-zA-Z]+".r
    val emailR = "\\w+@\\w+\\.\\w+".r
    val nameEmailR = "([a-zA-Z]+) (\\w+@\\w+\\.\\w+)".r
    list match {
      case List(nameEmailR(name, email), _*) => {
        name + " " + email.substring(email.indexOf("@") + 1)
      }
      case List(name@nameR, email@emailR, _*) => {
        name + " " + email.substring(email.indexOf("@") + 1)
      }
      case _ => "invalid"
    }
  }

  println(getNameAndEmail(input1))
  println(getNameAndEmail(input2))


}
