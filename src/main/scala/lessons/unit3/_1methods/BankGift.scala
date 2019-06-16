package lessons.unit3._1methods

object BankGift {

  // was
  //  def sendGift(currentAmount: Int, gift: Int)
  def sendGift(currentAmount: Int, gift: => Int) = {
    if (currentAmount >= 500) {
      currentAmount + gift
    } else
      currentAmount
  }

  def getGift() = {
    println("The gift is received")
    100
  }

  val accountAmounts = List(100, 200, 500, 300, 700)

  def main(args: Array[String]): Unit = {
    val newAmounts = accountAmounts.map(amount => sendGift(amount, getGift()))
    println(newAmounts)
  }

}
