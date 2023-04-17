import kotlin.random.Random

fun main() {
    val random = Random.nextInt(15)
    println("$random")
    var counter = 0
    do {
        println("enter number")
        val userGuess = Integer.valueOf(readln())
        if (userGuess < random) {
            println("too low")
            counter++
        } else if (userGuess > random) {
            println("too high")
            counter++
        } else if (userGuess==random) {
            println("correct!")
            println("incorrect guesses:$counter")
        }
    } while (userGuess<random || userGuess>random)

}
