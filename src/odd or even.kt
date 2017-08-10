
fun main(args:Array<String>)
{

    println("Enter a number to check whether its ODD or EVEN")
    var a:Int = readLine()!!.toInt()
    if (a % 2==0)
        println("$a is an Even number")
    else
        println("$a is a Odd number")

}