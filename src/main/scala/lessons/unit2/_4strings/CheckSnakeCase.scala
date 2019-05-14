package lessons.unit2._4strings

import scala.io.StdIn

object CheckSnakeCase {
  def main(args: Array[String]) {
    val line = StdIn.readLine()
    val regex = "^[a-z]([a-z]+_?[a-z]+)*[a-z]?$"
    print(line.matches(regex))

  }
}
