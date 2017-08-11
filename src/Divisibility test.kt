/* Divisibility test program */

fun main(args: Array<String>) {
    println("Enter a dividend")
    var a: Int = readLine()!!.toInt()  //store dividend in variable a
    println("Enter divisor")
    var b: Int = readLine()!!.toInt() //store divisor in variable b
    if (a % b == 0)
        println("$a is the multiple of $b")
    else
        println("$a is not the multiple ob $b")
}