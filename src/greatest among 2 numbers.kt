/* In this program user will input 2 numbers
   and gets the greatest number as an output among.
   eg:
   Input: Enter 2 numbers: 4 5
   Output: greatest number is :5
 */

fun main(args: Array<String>) {
    print("Enter 2 numbers:")
    var first: Int = readLine()!!.toInt()
    var second: Int = readLine()!!.toInt()
    val max: Int = if (first > second) first else second
    println("The greatest number is: $max")

}