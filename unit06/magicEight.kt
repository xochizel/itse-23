import kotlin.random.Random
fun main (){
    val random = Random.nextInt(10)
    println("enter question")
    val ques = readln()
    println("$ques")
    when (random) {
        1 -> println("Yes, of course!")
        2 -> println("Without a doubt, yes.")
        3 -> println("You can count on it.")
        4 -> println("For sure!")
        5 -> println("Ask me later.")
        6 -> println("I’m not sure.")
        7 -> println("I can’t tell you right now.")
        8 -> println("No way!")
        9 -> println("I don’t think so.")
        10 -> println("Without a doubt, no.")
    }
}
