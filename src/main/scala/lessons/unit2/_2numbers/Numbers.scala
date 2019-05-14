package lessons.unit2._2numbers

object Numbers extends App {
  val a = 10
  val b = -5L
  val c = 10.3
  val d = 10.6f
  val e = 1e3
  val f = 0xA1

  val x: BigInt = BigInt(10)
  val y = x pow a


  println(((1: Short) + (2: Short)).toShort)

  println(('A'.toInt + 10).toChar)

  val l = 22132313212121L + 234324324L
  println(l)

  val bi = BigInt(l)
  bi.gcd(12)

  println("2332".toInt)

  println("a".toInt)
}
