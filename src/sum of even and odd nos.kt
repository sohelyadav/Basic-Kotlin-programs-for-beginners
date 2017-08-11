/* In this program user will enter a limit upto which he/she
   wants to find the sum of all odd and even natural numbers.
   Eg:
   Input:  Enter the limit=6
   Output: sum of all odd numbers=9    i.e, (1+3+5)
           Sum of all even numbers=12  i.e, (2+4+6)
 */

fun main(args: Array<String>) {
    var sumOfEven: Int = 0
    var sumOfOdd: Int = 0
    print("Enter the limit")
    var limit: Int = readLine()!!.toInt()

    for (item in 1..limit) {
        if (item % 2 == 0)
            sumOfEven += item
        else
            sumOfOdd += item
    }
    println("Sum of all odd numbers:$sumOfOdd")
    println("Sum of all even numbers:$sumOfEven")
}