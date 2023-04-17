fun main() {
    var numSum = 0
    println("Enter a positive non zero integer value")
    var userInput = Integer.valueOf(readLine())
    try {
        if (userInput<51 && userInput >0) {
            var listInputs = 0..userInput
            println("Your sum is")
            print(listInputs.sum())
        }
        else {
            println("Invalid input. Please enter a positive integer.")
        }
    }
    catch(e:Exception) {
        println("Invalid input. Please enter a positive integer.")
    }

}
