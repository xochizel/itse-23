fun main() {
    println("enter three names")
    var name1 = readln()
    var name2 = readln()
    var name3 = readln()
    val word = listOf(name1,name2,name3)
    val sortedWords = word.sorted()
    println("$sortedWords")


}
