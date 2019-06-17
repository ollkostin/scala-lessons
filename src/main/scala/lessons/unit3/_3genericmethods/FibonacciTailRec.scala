package lessons.unit3._3genericmethods

import scala.annotation.tailrec

object FibonacciTailRec extends App {


  @tailrec
  def fibs(n: Int, currentNumber: Int = 1, f1: BigInt = 0, f2: BigInt = 1): BigInt = {
    if (n == currentNumber)
      f2
    else {
      println(s"n: $n currentNumber: $currentNumber, f1 : $f1, f2 : $f2")
      fibs(n, currentNumber + 1, f2, f2 + f1)
    }
  }

  println(fibs(4))


}
