fun main() {
    val restaurant = mutableListOf("joe", "main", "corner", "mama", "chef")
    println("is anyone vegetarian")
    var veg = readln()
    when (veg) {
        "yes" -> { restaurant.remove("joe") }
    }
    println("is anyone vegan")
    var vegan = readln()
    when (vegan) {
        "yes" -> { restaurant.remove("joe")
            restaurant.remove("main")
            restaurant.remove("mama") }
    }
    println("is anyone gluten-free")
    var glute = readln()
    when (glute) {
        "yes" -> { restaurant.remove("joe")
        restaurant.remove("mama") }
    }
    println("$restaurant")
}
