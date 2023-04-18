fun calculateRetail() {
    println("enter wholesale cost")
    val wholeSale = Integer.valueOf(readln())
    println("enter markup percentage")
    val markUp = Integer.valueOf(readln())
    val retailPrice = wholeSale + (wholeSale * markUp)
    println("$retailPrice")
}
fun main () {
calculateRetail()
}
