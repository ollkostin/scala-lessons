package lessons.unit3._1methods

// TODO: finish this function and get rid of compile error

object Fib {
  //  def fib(num : Int) = {
  //    if (num == 1) 1
  //    else if (num == 2) 2
  //    else ???
  //  }

  //we need to specify return type
  def fib(num: Int): Int = {
    if (num == 1) 1
    else if (num == 2) 2
    else fib(num - 1) + fib(num - 2)
  }
}
