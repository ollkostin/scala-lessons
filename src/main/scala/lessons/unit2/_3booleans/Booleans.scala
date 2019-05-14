package lessons.unit2._3booleans

object Booleans extends App {
  def _1 = {
    val s1 = "foo"
    val s2 = "foo"
    println(s1 eq s2)
  }

  def _2 = {
    val s3 = "bar"
    val s1 = "foo" + s3
    val s2 = "foo" + s3
    println(s1 == s2)
  }

  def _3 = {
    val s3 = "bar"
    val s1 = "foo" + s3
    val s2 = "foo" + s3
    println(s1 eq s2)
  }

  def _4 = {
    val s1 = "foo"
    val s2 = "foo"
    println(s1 == s2)
  }

  _1
  _2
  _3
  _4
}
