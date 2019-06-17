package lessons.unit4._1ex

object Example extends App {
  val x = 1
  if (x == 1)
    print("one")
  else if (x == 2)
    print("two")
  else
    print("???")


  print(if (x == 1) "one"
  else if (x == 2) "two"
  else "???"
  )

  var i = 0
  while (i <= 10) {
    print(i)
    i += 2
  }


  for (i <- 1 to 10) {
    print(i)
  }

  for (i <- 1 to 10; j <- i to 10) {
    print(s"$i $j")
  }

  for {
    i <- 1 to 10
    j <- 1 to 10 if i > j
  } print(s"$i $j")


}
