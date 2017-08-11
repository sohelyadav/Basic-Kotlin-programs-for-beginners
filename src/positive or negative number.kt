/* Check whether the input is
   positive integer or negative
   number.
   input:-3
   output: negative number.
 */

fun main(args: Array<String>) {
    print("Enter a number to check:")
    var no: Int = readLine()!!.toInt()
    if (no >= 0)
        println("Positive number")
    else
        println("negative number")
}