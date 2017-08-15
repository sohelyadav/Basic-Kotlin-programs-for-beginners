/* Accept the temperature in fahrenheit and convert it in celsius

 */

fun main(args: Array<String>) {
    println("Enter the temperature in fahrenheit: ")
    val f: Float = readLine()!!.toFloat()
    val c: Float = (f - 32) * 5 / 9
    println("Temperature in celsius: $c")
}