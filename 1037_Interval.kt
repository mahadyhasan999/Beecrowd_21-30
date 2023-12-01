import java.util.*

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val num = read.nextDouble()

    if (0<=num && num<=25){
        println("Intervalo [0,25]")
    }
     else if (25<num && num<=50){
        println("Intervalo (25,50]")
    }
    else if (50<num && num<=75){
        println("Intervalo (50,75]")
    }
    else if (75<num && num<=100){
        println("Intervalo (75,100]")
    }
    else{
        println("Fora de intervalo")
     }
}