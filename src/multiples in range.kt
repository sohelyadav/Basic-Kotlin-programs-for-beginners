/* This program gives all the multiples of a given
   number in given range and total no. of multiples also.
   Eg:
   Input:Enter a range:4-10
         Enter the divisor:3

   Output:multiples of 3 are:  6 9
          total no. of multiples: 2

 */

fun main(args: Array<String>) {
    var count: Int = 0
    print("Enter the range: ")
    var a: Int = readLine()!!.toInt()  // a stores the lower limit
    print(" to ")
    var b: Int = readLine()!!.toInt()  // b stores the upper limit
    print("\nEnter the divisor: ")
    var c: Int = readLine()!!.toInt()   // c stores the divisor
    print("\nMultiples of $c are: ")
    for (multiple in a..b) {
        if (multiple % c == 0) {
            println("$multiple")
            count++                 // To count the no. total no. of multiples
        }
    }
    println("\nTotal no. of multiples are: $count")
}