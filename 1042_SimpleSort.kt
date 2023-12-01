/*Read three integers and sort them in ascending order.
 After, print these values in ascending order, a blank line and
  then the values in the sequence as they were readed.

Input
The input contains three integer numbers.

Output
Present the output as requested above.*/

//
//import java.util.*
//
//fun main(args: Array<String>) {
//    val read = Scanner(System.`in`)
//    val a = read.nextInt()
//    val b = read.nextInt()
//    val c = read.nextInt()
//
//    val numbers = arrayOf(a, b, c)
//    val sortedNumbers = numbers.sortedArray()
//
//    for (number in sortedNumbers) {
//        println(number)
//    }
//
//    println()
//
//    for (number in numbers) {
//        println(number)
//    }
//}
//

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val a = input.nextInt()
    val b = input.nextInt()
    val c = input.nextInt()

    val min = minOf(a, minOf(b, c))
    val max = maxOf(a, maxOf(b, c))
    val mid = a + b + c - min - max

    println("$min\n$mid\n$max\n")
    println("$a\n$b\n$c")
}
