fun main() {
    println("Enter principal originally added to account")
    var thePrincipal = Integer.valueOf(readLine())
    
    println("Enter annual interest rate in decimal form paid by account")
    var decimalRate = Integer.valueOf(readLine())
    
    println("Enter number of times interest is compounded per year")
    var theNumber = Integer.valueOf(readLine())
    
    println("Enter number of years account will earn interest")
    var timeYears = Integer.valueOf(readLine())

    var exponent = theNumber * timeYears
    var almostInterest = 1 + (decimalRate / theNumber)
    var actualInterest = Math.pow(almostInterest.toDouble(),exponent.toDouble())
    var compoundInterest = thePrincipal * actualInterest
    println("Answer:$compoundInterest")




}
