package lessons.unit5._2collections

import scala.io.StdIn.readLine

/**
 * Считайте числа из консоли до слова END.
 * С полученным списком необходимо выполнить:
 * выбрать каждый второй элемент
 * каждый выбранный элемент умножить на 2
 * вывести в консоль сумму элементов полученного списка
 * Рекомендация: для считывания в список можно использовать Stream
 */
object ChooseElementsConsole {

  def main(args: Array[String]) {
    println(process())
  }

  private def process(): Long = {
    var list: List[Long] = List()
    var line: String = ""
    do {
      line = readLine()
      if (isEnd(line)) return skip[Long](list, 2).sum * 2
      list = list :+ line.toLong
    } while (!isEnd(line))
    skip[Long](list,2).sum * 2
  }

  private def skip[T](list: List[T], n: Long): List[T] =
    list.zipWithIndex.collect { case (e, i) if ((i + 1) % n) == 0 => e }

  private def isEnd(line: String) = line == "END"
}

