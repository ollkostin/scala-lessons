package lessons.unit4._5option

/**
  * Дана некоторая функция bar: Int => Option[Int] и опциональное значение x: Option[Int].
  * Примените bar к содержимому x так, чтобы получилось Option[Int].
  */
object Bar extends App {

  def bar(i: Int): Option[Int] = Option(i)

  var x = Option(1)
  var y = None
  print(x.flatMap(d => bar(d)))
}
