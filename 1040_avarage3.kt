import java.util.*

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val N1 = read.nextDouble()
    val N2 = read.nextDouble()
    val N3 = read.nextDouble()
    val N4 = read.nextDouble()

    val avg = (N1*2+N2*3+N3*4+N4)/(10)

    println("Media: ${"%.1f".format(avg)}")
    if(avg >= 7.0) {
        println("Aluno aprovado.")
    }
    else if(avg<5.0) {
        println("Aluno reprovado.")
    }
    else if(avg in 5.0..6.9) {
        println("Aluno em exame.")
        print("Nota do exame: ")
        val N5 = read.nextDouble()
        val newAvg = (avg + N5)/2
        if (newAvg >= 5.0){
            println("Aluno aprovado.")
        }
        else if (newAvg <=4.9){
            println("Aluno reprovado.")
        }
        println("Media final: ${"%.1f".format(newAvg)}")
    }
}