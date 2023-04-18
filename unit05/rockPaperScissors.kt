import kotlin.random.Random
fun main () {
    val random = Random.nextInt(1,3)
    val computerRPS = when (random) {
        1 -> "r"
        2-> "p"
        3-> "s"
        else -> ""
    }
    println("$computerRPS")
    var userRPS:String = ""
    do {
        println("enter r p or s")
        userRPS = readln()
        if (userRPS==computerRPS) {
            println("tie! try again")
        }
    } while (userRPS==computerRPS)
    fun result () {
        if (computerRPS == "r"
            && userRPS == "p" ) {
            println("user wins")
        }
        else if (computerRPS == "r"
            && userRPS == "s" ) {
            println("computer wins")
        }
        else if (computerRPS == "p"
            && userRPS == "r" ) {
            println("computer wins")
        }
        else if (computerRPS == "p"
            && userRPS == "s" ) {
            println("user wins")
        }
        else if (computerRPS == "s"
            && userRPS == "r" ) {
            println("user wins")
        }
        else if (computerRPS == "s"
            && userRPS == "p" ) {
            println("computer wins")
        }
    }
    result()
}
