package lessons.unit4._2patternmatching


object Email extends App {
  val input1 = List("oleg", "oleg@email.com", "7bdaf0a1be3", "a8af118b1a2", "28d74b7a3fe")
  val input2 = List("oleg oleg@email.com", "7bdaf0a1be3", "a8af118b1a2", "28d74b7a3fe")
  val input3 = List("Oleg 123@gmail.com", "123@gmaiasdl.com")
  val input4 = List("Oleg ol@gmail.com", "asdasdasdasd")
  val inputs = List(input1, input2, input3, input4)

  def getNameAndEmail(input: List[String]): String = {
    val nameR = "([a-zA-Z]+)".r
    val emailR = "(\\w+@\\w+\\.\\w+)".r
    val nameEmailR = "([a-zA-Z]+) (\\w+@\\w+\\.\\w+)".r
    val result = input match {
      case List(nameEmailR(name, email), _*) =>
        s"$name ${email.substring(email.indexOf("@") + 1)}"
      case List(nameR(name), emailR(email), _*) =>
        s"$name ${email.substring(email.indexOf("@") + 1)}"
      case _ => "invalid"
    }
    result
  }

  inputs.map(getNameAndEmail).foreach(println)

}
