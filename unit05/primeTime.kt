fun isNumberDivisible(number: Int, divisor: Int):Boolean {
    var prime = "false"
    if (number%divisor==0){
        prime = "true"
    }
    if (prime == "true"){
        return false
    } else {
        return true
    }
}
fun isPrime (number: Int):Boolean {
    var place:Boolean = false
    for (i in 2..number/2){
        isNumberDivisible(number,i)
        if (isNumberDivisible(number,i) == true) {
            place = true
        }
    }
    if (place==true){
        return true
    }else return false
}
fun main (){
    isPrime(6)
    println("${isPrime(6)}")
    isPrime(13)
    println("${isPrime(13)}")
    isPrime(8893)
    println("${isPrime(8893)}")
}
