/* Program to find the area and parameter of circle
   Area=length * width
   Parameter=2(length + width)
  */

fun main(args: Array<String>) {
    println("Enter the length")
    val l: Float = readLine()!!.toFloat()                   // l stores the radius
    println("Enter the width")
    val w: Float = readLine()!!.toFloat()                   // w stores the width
    val a: Float = l * w                                     // a store the area
    val p: Float = 2 * (l + w)                                 // p stores the parameter
    println("Area of rectangle: %.2f".format(a))            // function to round off the floating value
    println("Parameter of the rectangle: %.2f".format(p))   // up-to 2 decimal point. ie, ("%.2f".format(value))

}