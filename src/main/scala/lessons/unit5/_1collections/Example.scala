package lessons.unit5._1collections

import scala.collection.mutable

object Example extends App {

  val arr: Array[Int] = Array(1, 2, 3, 4)

  val str: String = "course"

  val char: Char = str(1)

  val newStr = str + " new"

  //interpolation faster then concatenation
  val interpolated = s"$str $char"

  val buffer: mutable.Buffer[String] = mutable.Buffer("a", str, newStr)

  buffer += "aaa"

  println(buffer)

  val set: mutable.Set[String] = mutable.Set("a", str, newStr)

  set += "a"
  set += "a"

  println(set)

  val map: mutable.Map[Int, String] = mutable.Map()

  map.put(1, "One")
  map.put(2, "Two")

  println(map)

}
