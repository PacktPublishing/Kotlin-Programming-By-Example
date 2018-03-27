fun main(args: Array<String>) {
  // block A begins
  var a = 10
  var i = 1

  while (i < 10) {
    // block B begins
    val b = a / i
    print(b)
    i++
  }
  print(b) // Error occurs: variable b is out of scope
}
