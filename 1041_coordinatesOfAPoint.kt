/*Write an algorithm that reads two floating values (x and y), which should represent
 the coordinates of a point in a plane. Next, determine which quadrant the point belongs,
  or if you are at one of the Cartesian axes or the origin (x = y = 0).

If the point is at the origin, write the message "Origem".
If the point is at X axis write "Eixo X", else if the point is at Y axis write "Eixo Y".

Input
The input contains the coordinates of a point.

Output
The output should display the quadrant in which the point is.*/

import java.util.*

fun main(args: Array<String>) {

    val read = Scanner(System.`in`)

    val x = read.nextFloat()
    val y = read.nextFloat()

    if(x == 0.0.toFloat() && y== 0.0.toFloat()){
        println("Origem")
    }
    else if (x!=0.0.toFloat() && y== 0.0.toFloat()){
        println("Eixo X")
    }
    else if (y!=0.0.toFloat () && x== 0.0.toFloat()){
        println("Eixo Y")
    }
    else if (x>0 && y>0){
        println("Q1")
    }
    else if (x<0 && y>0){
        println("Q2")
    }
    else if (x<0 && y<0){
        println("Q3")
    }
    else if (x>0 && y<0){
        println("Q4")
    }
}