import java.net.InetAddress

/* Program to know the IP address of your system.
 */

fun main(args: Array<String>) {
    println(InetAddress.getLocalHost())

}