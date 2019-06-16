package lessons.unit3._1methods

object TailRecursionExample extends App {

  def sumEven(n: Int): Int = {
    def go(i: Int): Int = {
      if (i > n) 0
      else i + go(i + 2)
    }

    go(2)
  }

  sumEven(100)

  sumEven(10000)

  //  SOE
  //  sumEven(10000000)

  //tail recursive method, no SOE
  def sumEvenTailRec(n: Int): Long = {
    def go(i: Int, acc: Int): Long = {
      if (i > n) 0
      else go(i + 2, acc + i)
    }

    go(2, 0)
  }

  sumEvenTailRec(100)
  sumEvenTailRec(10000)
  sumEvenTailRec(10000000)
}
