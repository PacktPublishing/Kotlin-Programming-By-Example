class Printer {
    companion object DocumentPrinter { // Companion object identified by DocumentPrinter
        fun printDocument() = println("Document printing successful.")
    }
}

fun main(args: Array<String>) {
    Printer.DocumentPrinter.printDocument() // printDocument() invoked via
                                            // a named companion object
}
