fun main() {
    println("enter your weight in pounds")
    var weight = Integer.valueOf(readLine())
    println("enter your height in inches")
    var height = Integer.valueOf(readLine())
    val bmi1 = weight * 703
    val bmi2 = height * height
    val bmiReal = bmi1 / bmi2
    println("$bmiReal")
    val score = when {
        bmiReal > 25 -> "over"
        bmiReal < 18.5 -> "under"
        else -> "optimal"
    }
    println("$score")
}
