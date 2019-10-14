package lessons.unit5._2collections

import scala.collection.immutable

object Example extends App {
  val list = List(1, 2, 3, 2)
  val vector = Vector(1, 2, 3, 2)
  val stream = Stream(1, 2, 3, 2)
  val set = Set(1, 2, 3, 2)
  val map = Map("Москва" -> 12, "Питер" -> 33)

  val phrase1 = Vector("+")

  //add to tail
  val phrase2 = phrase1 :+ "Scala"

  //add to head
  val phrase3 = "Java" +: phrase2

  val phrase4 = Stream.empty[String]

  val phrase5 = phrase4 :+ "=" :+ "Love"

  //concatenate collections
  val phrase = phrase3 ++ phrase5

  //prints "Java+Scala=Love"
  print(phrase.mkString)

  val cities1 = Map("Москва" -> 12, "Питер" -> 33)

  val cities2 = cities1 + ("Волгоград" -> 13)

  val cities3: immutable.Seq[(String, Int)] = List("Ростов" -> 15)

  val cities4 = cities2 ++ cities3

}
