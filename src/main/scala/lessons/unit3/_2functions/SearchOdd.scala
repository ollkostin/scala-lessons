package lessons.unit3._2functions

object SearchOdd extends App {

  object LessonData {
    def searchInArray(cond: Int => Boolean, array: List[Int]): List[Int] = {
      array.filter(cond)
    }
  }

// was : val searchOdd = LessonData.searchInArray(_ % 2 == 1)
  val searchOdd : List[Int] => List[Int] = list => LessonData.searchInArray(_ % 2 == 1, list)

  println(searchOdd(List(8, 11, 12))) // List(11)

}
