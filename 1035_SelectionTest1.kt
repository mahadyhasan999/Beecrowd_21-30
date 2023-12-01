import java.util.*

fun main(args: Array<String>) {

    val read=Scanner(System.`in`)
    val A = read.nextInt()
    val B = read.nextInt()
    val C = read.nextInt()
    val D = read.nextInt()

    if(B>C && D>A && C+D > A+B && C>0 && D>0 && (A%2)==0 ){
    println("Valores aceitos")
    }
    else{
        println("Valores nao aceitos")
    }
}