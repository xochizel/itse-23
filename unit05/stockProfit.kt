fun profit () {
    println("number of shares")
    val numberShares = Integer.valueOf(readln())
    println("purchase price per share")
    val purchasePrice = Integer.valueOf(readln())
    println("purchase commission paid")
    val purchaseCommission = Integer.valueOf(readln())
    println("sale price per share")
    val sharePrice = Integer.valueOf(readln())
    println("sale commission paid")
    val saleCommission = Integer.valueOf(readln())
    val profit1 = ((numberShares*sharePrice)-saleCommission)
    val profit2 = profit1-((numberShares*purchasePrice)+purchaseCommission)
    println("$profit2")
}
fun main () {
    profit()
}
