package lessons.unit3._1methods

object Example {

  def plusOne(number: Int): Int = number + 1

  def plus(x: Int, y: Int = 0, z: Int = 1) = x + y + z

  def sixty: Int = 10 * 6

  def unitMethod(i: Int): Unit = {
    print("no return type method " + i)
  }

  def plusAndPrint(x: Int, y: Int): Int = {
    val result = x + y
    println(s"$x + $y = $result")
    result
  }

  def plusMul(q: Int, x: Int, y: Int): Int = {
    def mul(u: Int) = q * u

    mul(x) * mul(y)
  }

  //nums is collection
  def sumAllTimes(u: Int, nums: Int*): Int = u * nums.sum

  def replaceNegative(x: Int, z: => Int): Int = if (x >= 0) x else z

  def main(args: Array[String]): Unit = {
    plusOne(1)
    plus(2, 1, 3)
    var s = sixty
    unitMethod(s)
    val res = plusAndPrint(1, 2)
    val pm = plusMul(10, 2, 3)

    val sum = sumAllTimes(1, 2, 3, 4, 5)
    plus(1)
    plus(1, y = 1)
    plus(1, z = 0)

    //2 argument computes only when necessary
    // like orElseGet
    replaceNegative(1, 3 * 3 * 3)
    replaceNegative(-1, 3 * 3 * 3)
  }


}
