fun main() {
    println("enter mass of object in kilograms")
    var mass = Integer.valueOf(readLine())
    val weight = mass * 9.8
    val answer = when {
        weight > 1000 -> "heavy"
        weight < 10 -> "light"
        else -> print("just right")
    }
    println("$answer")


}
