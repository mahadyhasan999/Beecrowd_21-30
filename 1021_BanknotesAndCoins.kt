/*Read a value of floating point with two decimal places. This represents a monetary value.
 After this, calculate the smallest possible number of notes and coins on which
  the value can be decomposed. The considered notes are of 100, 50, 20, 10, 5, 2.
   The possible coins are of 1, 0.50, 0.25, 0.10, 0.05 and 0.01.
    Print the message “NOTAS:” followed by the list of notes and
     the message “MOEDAS:” followed by the list of coins.

Input
The input file contains a value of floating point N (0 ≤ N ≤ 1000000.00).

Output
Print the minimum quantity of banknotes and coins necessary to change the initial value,
 as the given example.*/

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    var N = read.nextDouble()


    val NN = N.toInt()

    val a = NN / 100//
    val b = NN % 100

    val c = b / 50//
    val d = b % 50

    val e = d / 20//
    val f = d % 20

    val g = f / 10//
    val h = f % 10

    val i = h / 5//
    val j = h % 5

    val k = j / 2//
    val l = j % 2

    println("NOTAS:")
    println("$a nota(s) de R$ 100.00")
    println("$c nota(s) de R$ 50.00")
    println("$e nota(s) de R$ 20.00")
    println("$g nota(s) de R$ 10.00")
    println("$i nota(s) de R$ 5.00")
    println("$k nota(s) de R$ 2.00")



    val CC = (N * 100).toInt()

    val n = CC % 100

    val o = n / 50//
    val p = n % 50

    val q = p / 25//
    val r = p % 25

    val s = r / 10//
    val t = r % 10

    val u = t / 5//
    val v = t % 5

    println("MOEDAS:")
    println("$l moeda(s) de R$ 1.00")
    println("$o moeda(s) de R$ 0.50")
    println("$q moeda(s) de R$ 0.25")
    println("$s moeda(s) de R$ 0.10")
    println("$u moeda(s) de R$ 0.05")
    println("$v moeda(s) de R$ 0.01")

}