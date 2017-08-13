/* write a program to swap 2 nos without using 3rd variable
   input: Enter 2 nos to swap: 3 4
   Output: Nos after swapping: 4 3
 */

fun main(args: Array<String>) {
    println("Enter nos to swap them: ")
    var a: Int = readLine()!!.toInt()    //let a=3
    var b: Int = readLine()!!.toInt()    //let b=4
    b += b                                //New value of b=3+4=7
    a = b - a                               //New value of a=7-3=4
    b -= a                                //New value of b=7-4=3
    println("numbers after swapping: $a $b")
}
