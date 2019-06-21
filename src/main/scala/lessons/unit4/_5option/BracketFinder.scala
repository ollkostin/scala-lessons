package lessons.unit4._5option

/**
  * BracketFinder.
  *
  * @author Vladimir_Kostin
  */
object BracketFinder extends App {

  val string = "All you need is [love]"

  def indexOf(s: String, pattern: String): Option[Int] =
    Option(s.indexOf(pattern)).filter(_ >= 0)

  println(indexOf(string, "["))
  println(indexOf(string, "7"))

  def brackets(s: String): Option[(Int, Int)] =
    indexOf(s, "[").flatMap { opening =>
      indexOf(s, "]")
    }.map(closing => (opening, closing))

  print(brackets(string))
}
