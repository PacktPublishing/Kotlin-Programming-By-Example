fun printEvenNumbers(numbers: Array<Int>) {
  numbers.forEach {
    when (it % 2) {
      0 -> println(it)
    }
  }
}

fun main (args: Array<String>) {
  val numberList: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6)
  printEvenNumbers(numberList)
}
