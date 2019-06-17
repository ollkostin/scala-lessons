package lessons.unit3._3genericmethods

object Example extends App {
  def ifThenElse[A](cond: Boolean, t: => A, e: => A): A = if (cond) t else e


  ifThenElse(1 > 2, "one", "two")
  ifThenElse(1 > 2, 1, 2)

  ifThenElse[String](1 > 2, "one", "two")
  ifThenElse[Int](1 > 2, 1, 2)


  def combineOn[A, B](comb: (B, B) => B)
                     (f: A => B, g: B => A): (A, A) => A =

    (x, y) => g(comb(f(x), f(y)))

  val sumStrings = combineOn[String, Int](_ + _)(_.toInt, _.toString)
  print(sumStrings("123", "32"))

}
