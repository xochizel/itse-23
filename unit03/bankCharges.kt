fun main() {
    println("enter the number of checks written for the month")
    val checkNumber = Integer.valueOf(readLine())
    val checkCost = if (checkNumber<20) {
        checkNumber*0.10
    }
    else if (checkNumber<39) {
            checkNumber*0.08
    }
    else if (checkNumber<59) {
        checkNumber*  0.06
    }
    else if (checkNumber>=60) {
        checkNumber*0.04
    }
    else ""

println("Your bank service fees are $checkCost")
}
