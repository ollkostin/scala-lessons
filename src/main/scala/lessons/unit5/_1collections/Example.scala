package lessons.unit5._1collections

import scala.collection.mutable.{Buffer, Map, Set}

object Example extends App {

  val arr: Array[Int] = Array(1, 2, 3, 4)

  val str: String = "course"

  val char: Char = str(1)

  val newStr = str + " new"

  val interpolated = s"$str $char"

  val buffer: Buffer[String] = Buffer("a", str, newStr)

  buffer += "aaa"

  println(buffer)

  val set: Set[String] = Set("a", str, newStr)

  set += "a"
  set += "a"

  println(set)

  val map: Map[Int, String] = Map()

  map.put(1,"One")
  map.put(2,"Two")

  println(map)




}
