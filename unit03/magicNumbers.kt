fun main(){
    println("Enter Month in Numerical Form")
    var month = Integer.valueOf(readLine())
    println("Enter day of Month")
    var dateVar = Integer.valueOf(readLine())
    println("Enter last two digits of year")
    var years = Integer.valueOf(readLine())
    if(month*dateVar==years){
        println("Magic Date")
    }
    else {
        println("Not Magic Date")
    }
}
