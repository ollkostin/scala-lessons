package lessons.unit4._6either

object Flatten extends App {
  def flatten(options: List[Option[Int]]): List[Int] = options.filter(_.isDefined).map(_.get)

  print(flatten(List(Some(1), None, Some(3))))

}
