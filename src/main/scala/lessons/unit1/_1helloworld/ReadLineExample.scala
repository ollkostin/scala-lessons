package lessons.unit1._1helloworld

import scala.io.StdIn.readLine

object ReadLineExample {

  def main(args: Array[String]): Unit = {
    println("Hello, what's your name?")
    val line = readLine()
    println("Nice to meet you, " + line)
  }

}
