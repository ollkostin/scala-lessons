package lessons.unit3._2functions

object Example extends App {
  functions
  currying
  convertMethodToFunction
  composition

  private def functions = {
    val addOne: Int => Int = x => x + 1
    val plus: (Int, Int) => Int = (x, y) => x + y

    println(addOne(1))
    println(plus(1, 3))

    val addOne2 = (x: Int) => x + 1
    val plus2 = (x: Int, y: Int) => x + y

    println(addOne2(1))
    println(plus2(1, 3))

    val addOne3: Int => Int = _ + 1
    val plus3 = (_: Int) + (_: Int)
  }


  def convertMethodToFunction = {
    def addOne4(x: Int) = x + 1

    val add1 = addOne4 _

    def plus4(x: Int, y: Int) = x + y

    val pl1 = plus4 _
  }

  def functionAsArgument = {
    def greaterOn(f: Int => Int): (Int, Int) => Boolean = (x, y) => f(x) > f(y)

    val greaterOnOnes = greaterOn(x => x % 10)
    greaterOnOnes(23, 45) // false
    greaterOnOnes(27, 45) // true
  }

  def currying = {
    def plus: Int => Int => Int = x => y => x + y

    plus(1)(2)

    val plus3 = (x: Int, y: Int, z: Int) => x + y + z
    val plus3c: Int => Int => Int => Int = plus3.curried

    print(plus3c(1)(2)(3))
  }

  def composition = {
    val plus1 = (_: Int) + 1
    val mul3 = (_: Int) * 3


    val plusThenMul = plus1 andThen mul3
    val plusBeforeMul = plus1 compose mul3

    println(plusThenMul(5))
    println(plusBeforeMul(5))
  }
}
