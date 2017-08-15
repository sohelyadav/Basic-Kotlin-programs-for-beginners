/* Program to find the area and parameter of circle
   Area=pai*r^2
   Parameter=2*pai*r
  */

fun main(args: Array<String>) {
    println("Enter the radius of circle")
    val r: Float = readLine()!!.toFloat()                // r stores the radius
    var a: Float = 3.14F * r * r                              // a store the area
    var p: Float = 2 * 3.14F * r                              // p stores the parameter
    println("Area of circle: %.2f".format(a))            // function to round off the floating value
    println("Parameter of the circle: %.2f".format(p))   // up-to 2 decimal point. ie, ("%.2f".format(value))

}