import kotlin.random.Random

fun main() {
    val random = Random.nextInt(10)

    do {
        println("enter number")
        val userGuess = Integer.valueOf(readln())
        if (userGuess < random) {
            println("too low")
        } else if (userGuess > random) {
            println("too high")
        } else if (userGuess==random) {
            println("correct!")
        }
    } while (userGuess<random || userGuess>random)

}
