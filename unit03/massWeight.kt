fun main() {
    println("enter mass of object in kilograms")
    var mass = Integer.valueOf(readLine())
    val weight = mass * 98
    val answer = when {
        weight > 1000 -> "heavy"
        weight < 10 -> "light"
    }
    println("$answer")


}
