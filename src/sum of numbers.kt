/* In this program user will enter a limit
   upto which he/she wants to know the sum
   of natural numbers.
   eg:
   Input: 3
   Output: 6 (1+2+3)
*/

fun main(args: Array<String>) {
    var sum = 0
    print("Enter the limit upto which you want to know the sum:")
    var limit: Int = readLine()!!.toInt()
    for (item in 1..limit) {
        sum += item    //sum=sum+item
    }
    println("sum of upto $limit natural number is =$sum")

}