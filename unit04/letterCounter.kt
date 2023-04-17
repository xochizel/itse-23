fun main () {
    println("enter string")
    val userString = readln()
    println("enter character")
    val userCharacter = readln().first()
    var value = 0

    for (c in userString) {
        if (c == userCharacter) {
            value++
        }
    }
    println("$value")

}
