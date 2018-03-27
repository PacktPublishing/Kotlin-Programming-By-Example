package animals

class Lion(val mass: Int, val maxSpeed: Int) {

    fun kill(animal: Buffalo) { // Buffalo type used with our import
        if (!animal.isDead) {
            println("Lion attacking animal.")
            animal.isDead = true
            println("Lion kill successful.")
        }
    }
}
