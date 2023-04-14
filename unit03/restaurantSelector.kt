fun main() {
    val restaurant = mutableListOf("joe's burger", "main st pizza", "corner cafe", "mama's italian", "chef's kitchen")
    println("is anyone vegetarian")
    var veg = readln()
    when (veg) {
        "yes" -> { restaurant.remove("joe's burger") }
    }
    println("is anyone vegan")
    var vegan = readln()
    when (vegan) {
        "yes" -> { restaurant.remove("joe's burger")
            restaurant.remove("main st pizza")
            restaurant.remove("mama's italian") }
    }
    println("is anyone gluten-free")
    var glute = readln()
    when (glute) {
        "yes" -> { restaurant.remove("joe's burger")
        restaurant.remove("mama's italian") }
    }
    println("$restaurant")
}
