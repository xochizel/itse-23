fun main() {
    val cookieCalorie = 75.0
    println("Enter number of cookies consumed:")
    var cookieAmount = Integer.valueOf(readLine())
    var calorieAmount = cookieAmount * cookieCalorie
    println("Your calorie intake was : $calorieAmount")
}
