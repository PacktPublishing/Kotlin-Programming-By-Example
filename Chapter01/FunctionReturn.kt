fun returnFullName(firstName: String, surname: String): String {
  return "${firstName} ${surname}"
}

fun main(args: Array<String>) {
  val fullName: String = returnFullName("James", "Cameron")
  println(fullName) // prints: James Cameron
}
