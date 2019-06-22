package lessons.unit4._5option

/**
  * Метод List.find(p: Char => Boolean): Option[Char] пытается найти первый символ, удовлетворяющий предикату p. Напишите функцию foo(list: List[Int]): Int, которая находит в списке list первое число, которое делится на 3, и домножает его на 2. Если таких чисел нет, функция должна вернуть 0.
  *
  * Пользуйтесь только find, анонимными функциями и методами Option.
  */
object Int3Finder extends App {
  def foo(list: List[Int]): Int =
    list.filter(p => p % 3 == 0).map(p => p * 2).headOption.getOrElse(0)

}


