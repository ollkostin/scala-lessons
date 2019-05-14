package lessons.unit2._3booleans

object CheckIsCapital {
  def main(args: Array[String]): Unit = {
    print(isCapital("Aa", 0))
    print(isCapital("Aa", 1))
  }

  def isCapital(word: String, pos: Int): Boolean = {
    word.charAt(pos).isUpper
  }

}
