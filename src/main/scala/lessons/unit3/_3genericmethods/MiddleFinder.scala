package lessons.unit3._3genericmethods

object MiddleFinder extends App {
  def middle[A](data: Iterable[A]): A = data.splitAt(data.size / 2)._2.head


  require(middle("Scala") == 'a')
  require(middle(Seq(1, 7, 5, 9)) == 5)
}
