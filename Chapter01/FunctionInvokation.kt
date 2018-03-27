fun repeat(word: String, times: Int) { 
  var i = 0

  while (i < times) {
    println(word)
    i++
  }
}

fun main(args: Array<String>) {
  repeat("Hello!", 5)
}
