fun main() {
    println("enter the starting number of organisms")
    val input1 = Integer.valueOf(readLine())
        if (input1 < 2) {
            println("Not valid")
        }
    val startPop = input1


    println("enter the average daily population increase (as a percentage)")
    val input2 = Integer.valueOf(readLine())
    if (input2 <= 0) {
        println("Not valid")
    }
    val popIncrease = input2/100

    println("enter the number of days they will multiply")
    val input3: Int = Integer.valueOf(readLine())
    if (input3 < 2) {
        println("Not Valid")
    }
    val days = (1..input3)
    var result = startPop
while (days=>1)
// basically i have no idea how to do the loop and how to make the result update with each loop
    result = result + (result*popIncrease)
    println("$result")
}
