package lessons.unit5._1collections

object KOrderStatistic {
  def main(args: Array[String]) {
    def kOrder(list: List[Int], k: Int): Int = {
      def partition(ints: List[Int], i: Int, i1: Int): Int = {
        return 0
      }

      var left = 0
      var right = list.size
      var result = 0
      var found = false
      while (!found) {
        val mid = partition(list, left, right)

        if (mid == k) {
          found = true
          result = list(mid)
        }
        else if (mid > k) right = mid
        else left = mid + 1
      }
      result
    }
  }
}
