import java.util.*

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val X = read.nextInt()
    val Y = read.nextInt().toDouble()
    var Z = 0.00

    when (X) {
        1 -> {
            Z = 4.00
        }
        2 -> {
            Z = 4.50
        }
        3 -> {
            Z = 5.00
        }
        4 -> {
            Z = 2.00
        }
        5 -> {
            Z = 1.50
        }
    }
    val total = (Z * Y)
    println("Total: R$ ${"%.2f".format(total)}")
}