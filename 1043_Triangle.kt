import java.util.*

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val a = read.nextDouble()
    val b = read.nextDouble()
    val c = read.nextDouble()

    if (a+b>c && a+c>b && b+c>a){
        val perimeter = a+b+c
            println("Perimetro = %.1f".format(perimeter))
    }
    else{
        val area = (a+b)*c*0.5
        println("Area = %.1f".format(area))
    }
}