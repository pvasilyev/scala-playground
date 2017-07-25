val numbers = Array(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8)
numbers(0)
numbers(3) = 10

val numbersList = List(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)

val numbersSet = Set(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)

val hostPort = ("localhost", 80)

hostPort match {
  case ("localhost", port) => println(hostPort)
  case (host, port) => println("generic")
}

1 -> 2
Map(1 -> 2)
Map("foo" -> "bar")

val numbersMap = Map("one" -> 1, "two" -> 2)
numbersMap.get("two")
numbersMap.get("three")

List(1, 2, 3).zip(List("a", "b", "c"))
List(1, 2, 3).zip(List("a", "b", "c", "D"))

numbers.find((i: Int) => i > 5)

numbers.drop(5)
def sum = {
  (m: Int, n: Int) => m + n
}
numbers.foldLeft(0)(sum)
List().foldLeft(0)(sum)

List(List(1, 2, List(3, 4, 5, 6 )), List(3, 4)).flatten

val nestedNumbers = List(List(1, 2), List(3, 4))
nestedNumbers.flatMap(x => x.map(_ * 2))

