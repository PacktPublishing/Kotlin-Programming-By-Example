class Printer {
    companion object DocumentPrinter {
        fun printDocument() = println("Document printing successful.")
    }
}

fun main(args: Array<String>) {
    Printer.printDocument() // printDocument() invoked via companion object
    Printer.Companion.printDocument() // also invokes printDocument() via 
                                      // a companion object
}
