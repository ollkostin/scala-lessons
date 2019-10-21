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

  val cities = Vector("Москва", "Волгоград", "Питер")

  println(cities(1)) //Волгоград
  println(cities.head) //Москва
  println(cities.last) //Питер

  println(cities.size) //3
  println(cities.contains("Волгоград")) //true
  println(cities.indices) //0 until 2

  val cityMap = Map("Москва" -> 1, "Питер" -> 3)

  println(cityMap.size) //2
  println(cityMap.keySet) //Set("Москва" , "Питер")
  println(cityMap.contains("Питер")) //true

  println(cityMap("Москва")) // 1
  println(cityMap.get("Питер")) // Some(3)
  println(cityMap.get("Волгоград")) // None

  val citySet = Set("Москва", "Волгоград", "Питер")
  println(citySet("Москва")) //true
  println(citySet("MSK")) //false

  println(citySet.size) //3
  println(citySet.contains("Москва")) //true




}
