// Program to find Simple Interest

fun main(args: Array<String>) {
    println("Enter Principle amount: ")
    val p: Double = readLine()!!.toDouble()
    println("Enter Rate: ")
    val r: Double = readLine()!!.toDouble()
    println("Enter Time: ")
    val t: Double = readLine()!!.toDouble()
    val si: Double = (p * r * t) / 100
    println("Simple Interest = $si ")

}