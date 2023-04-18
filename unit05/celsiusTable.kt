fun celsius(farenheit:Int){
    val preCelsius = farenheit-32
    val celsius = (0.5555)*preCelsius
    println("the celsius temp is $celsius")
}
fun main(){
    for (int in 1..20){
        println("the farenheit temp is $int")
        celsius(int)
    }
}
