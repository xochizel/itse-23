fun fallingDistance (time:Int) {
    // d=1/2(gt2)
    val g = 9.8
    val distance= (0.5*(g*(time*time)))
    println("so the distance is $distance")
}
fun main() {
    for (int in 1..10){
        println("the time in seconds is $int")
        fallingDistance(int)
    }
}
