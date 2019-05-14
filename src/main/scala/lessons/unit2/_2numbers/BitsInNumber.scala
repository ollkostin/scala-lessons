package lessons.unit2._2numbers

object BitsInNumber {
  def main(args: Array[String]) {
    val line = readLine()
    val number = line.toInt.toBinaryString.count(char => char == '1')
    print(number)
  }
}
