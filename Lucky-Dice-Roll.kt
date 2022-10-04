fun main() {
    //número de lados
    val myFirstDice = Dice(6)
    //llamar a la funcion roll
    val rollResult = myFirstDice.roll()
    val luckyNumber = 4
    //funcion else-if dependiendo del resultado
    if (rollResult == luckyNumber) {
        println("You win!")
    } else if (rollResult == 1) {
        println("So sorry! You rolled a 1. Try again!")
    } else if (rollResult == 2) {
        println("Sadly, you rolled a 2. Try again!")
    } else if (rollResult == 3) {
        println("Unfortunately, you rolled a 3. Try again!")
    } else if (rollResult == 5) {
        println("Don't cry! You rolled a 5. Try again!")
    } else {
        println("Apologies! You rolled a 6. Try again!")
    }
}

class Dice (val numSides: Int) {
    //número aleatorio
    fun roll(): Int {
        return (1..numSides).random()
    }
}
