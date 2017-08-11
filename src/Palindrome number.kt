/* Check whether the given number is palindrome or not.
   Eg:
   Input: Enter a number: 121
   Output: Palindrome number (i.e, reverse of 121 is 121)
 */

fun main(args: Array<String>) {
    var reverse: Int = 0
    println("Enter a number to check:")
    var number: Int = readLine()!!.toInt()
    val temp = number
    while (number > 0) {
        var remainder: Int = number % 10
        reverse *= 10 + remainder
        number /= 10
    }
    if (reverse == temp)
        println("Palindrome number")
    else
        println("Not a palindrome number")
}