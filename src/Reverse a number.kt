/* In this program user will enter a number and gets
   an output as a reverse of that number.
   Eg:
   Input: Enter a number to reverse: 123
   Output: After reversing the number is 321.
 */

fun main(args: Array<String>) {
    var reverse: Int = 0
    print("Enter a number to reverse that:")
    var number: Int = readLine()!!.toInt()
    while (number > 0) {
        var remainder: Int = number % 10
        reverse = reverse * 10 + remainder
        number = number / 10
    }
    println("reverse of the number is= $reverse")
}