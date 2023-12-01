/*Read four numbers (N1, N2, N3, N4), which one with 1 digit after the decimal point,
 corresponding to 4 scores obtained by a student. Calculate the average
  with weights 2, 3, 4, 1 respectively, for these 4 scores and print the message "Media: " (Average),
   followed by the calculated result. If the average was 7.0 or more,
    print the message "Aluno aprovado." (Approved Student). If the average was less than 5.0,
     print the message: "Aluno reprovado." (Reproved Student). If the average was between 5.0 and 6.9,
      including these, the program must print the message "Aluno em exame." (In exam student).

In case of exam, read one more score. Print the message "Nota do exame: " (Exam score)
 followed by the typed score. Recalculate the average (sum the exam score with the previous calculated average
  and divide by 2) and print the message “Aluno aprovado.” (Approved student) in case of average 5.0 or more)
   or "Aluno reprovado." (Reproved student) in case of average 4.9 or less.
    For these 2 cases (approved or reproved after the exam) print the message "Media final: " (Final average)
     followed by the final average for this student in the last line.

Input
The input contains four floating point numbers that represent the students' grades.

Output
Print all the answers with one digit after the decimal point.*/

import java.util.*

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val N1 = read.nextFloat()
    val N2 = read.nextFloat()
    val N3 = read.nextFloat()
    val N4 = read.nextFloat()

    val avg = (N1*2+N2*3+N3*4+N4)/(10)

    println("Media: %.1f".format(avg))
    if(avg >= 7.0) {
        println("Aluno aprovado.")
    }
    else if(avg<5.0) {
        println("Aluno reprovado.")
    }
    else{
        println("Aluno em exame.")
        val N5 = read.nextFloat()
        println("Nota do exame: %.1f".format(N5))
        val newAvg = (avg + N5)/2
        if (newAvg >= 5.0){
            println("Aluno aprovado.")
        }
        else{
            println("Aluno reprovado.")
        }
        println("Media final: %.1f".format(newAvg))
    }
}
//
//import java.util.Scanner
//
//fun main(args: Array<String>) {
//    val input = Scanner(System.`in`)
//    val N1 = input.nextFloat()
//    val N2 = input.nextFloat()
//    val N3 = input.nextFloat()
//    val N4 = input.nextFloat()
//
//    val media = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / 10
//    println("Media: %.1f".format(media))
//
//    when {
//        media >= 7.0 -> println("Aluno aprovado.")
//        media < 5.0 -> println("Aluno reprovado.")
//        else -> {
//            println("Aluno em exame.")
//            val examScore = input.nextFloat()
//            println("Nota do exame: %.1f".format(examScore))
//            val finalMedia = (media + examScore) / 2
//            if (finalMedia >= 5.0) {
//                println("Aluno aprovado.")
//            } else {
//                println("Aluno reprovado.")
//            }
//            println("Media final: %.1f".format(finalMedia))
//        }
//    }
//}
