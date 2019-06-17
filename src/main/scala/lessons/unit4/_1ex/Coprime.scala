package lessons.unit4._1ex


object Coprime {
  def main(args: Array[String]): Unit = {
    val x = readInt()
    for {
      i <- 1 to x
      j <- 1 to x
    } {
      if (BigInt(i).gcd(BigInt(j)) == 1) {
        println(s"$i $j")
      }
    }
  }
}
