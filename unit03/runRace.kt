fun main () {
    println("enter runner 1 name")
    val runnerName1 = readln()
    println("enter runner 1 time")
    val runnerTime1 = Integer.valueOf(readLine())
    println("enter runner 2 name")
    val runnerName2 = readln()
    println("enter runner 2 time")
    val runnerTime2 = Integer.valueOf(readLine())
    println("enter runner 3 name")
    val runnerName3 = readln()
    println("enter runner 3 time")
    val runnerTime3 = Integer.valueOf(readLine())
    val runner1 = runnerTime1;runnerName1
    val runner2 = runnerTime2;runnerName2
    val runner3 = runnerTime3;runnerName3
    val runnerList = listOf(runner1,runner2,runner3)
    val sortedList = runnerList.sorted()
    println("$sortedList")

}
