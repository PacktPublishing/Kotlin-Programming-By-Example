import animals.Buffalo
import animals.Lion

fun main(args: Array<String>) {
    val lion = Lion(190, 80)
    val buffalo = Buffalo(620, 60)
    println("Buffalo is dead: ${buffalo.isDead}")
    lion.kill(buffalo)
    println("Buffalo is dead: ${buffalo.isDead}")
}
