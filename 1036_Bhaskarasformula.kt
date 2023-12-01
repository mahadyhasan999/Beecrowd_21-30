import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {

    val read=Scanner(System.`in`)
    val A = read.nextDouble()
    val B = read.nextDouble()
    val C = read.nextDouble()

    var Bh = (B*B)-(4*A*C)

    if(Bh >0 && A.toInt() !=0){
    Bh = Bh.pow(0.5)
        val X1 = (-B + Bh)/(2*A)
        val X2 = (-B - Bh)/(2*A)
        println("R1 = ${"%.5f".format(X1)}\nR2 = ${"%.5f".format(X2)}")
    }
    else{
        println("Impossivel calcular")
    }

}