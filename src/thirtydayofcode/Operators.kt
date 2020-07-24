package thirtydayofcode

import java.util.*
import kotlin.math.round // Do not forget this import !

private val scanner = Scanner(System.`in`)
fun main() {
    //also keyword means 'I wanna do something with this variable'
    scanner.nextDouble().also { mealCost ->
        println(round((mealCost * scanner.nextInt() / 100) + (mealCost * scanner.nextInt() / 100) + mealCost).toInt())
    }
}