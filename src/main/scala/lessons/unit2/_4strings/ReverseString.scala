package lessons.unit2._4strings

object ReverseString {
  def main(args: Array[String]): Unit = {
    val line = readLine().split(" ")

    val start = line(0).toInt
    val end = line(1).toInt

    val str = readLine()

    val sub = str.slice(start, end + 1)
    val reversed = sub.reverse
    val result = str.slice(0, start) + reversed + str.slice(end+1, str.length)
    print(result)
  }
}
