
/*Read an integer value corresponding to a person's age (in days) and print it in years,
 months and days, followed by its respective message “ano(s)”, “mes(es)”, “dia(s)”.

Note: only to facilitate the calculation, consider the whole year with 365 days
 and 30 days every month. In the cases of test there will never be a situation
  that allows 12 months and some days, like 360, 363 or 364.
   This is just an exercise for the purpose of testing simple mathematical reasoning.

Input
The input file contains 1 integer value.

Output
Print the output, like the following example.*/


import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    var days = read.nextInt()

    var remain = days % 365
    var remless = days - remain
    val years = remless / 365
    days = remain

    remain = days % 30
    remless = days - remain
    val months = remless / 30
    days = remain

    println("$years ano(s)\n$months mes(es)\n$days dia(s)")
}