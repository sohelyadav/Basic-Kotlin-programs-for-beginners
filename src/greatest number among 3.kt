/* In this program user will input 3 numbers and gets
   the greatest number in output among those 3 numbers.
   eg:
   input 4 8 2
   output: greatest no is 8.
 */

fun main(args: Array<String>) {
    print("Enter three numbers:")
    val first: Int = readLine()!!.toInt()
    val second: Int = readLine()!!.toInt()
    val third: Int = readLine()!!.toInt()

    if (first > second && first > third)
        println("greatest no is:$first")
    else if (second > first && second > third)
        println("greatest no is:$second")
    else
        println("greatest no is:$third")

}