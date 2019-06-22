package lessons.unit4._6either

object Example extends App {
  val numOrStr1: Either[Double, String] = Left(2.12)
  val numOrStr2: Either[Double, String] = Right("ssss")


  def info(numOrStr: Either[Double, String]) = numOrStr match {
    case Left(n) => s"num $n"
    case Right(s) => s"str $s"
  }

  print(info(numOrStr1))
  print(info(numOrStr2))
}
