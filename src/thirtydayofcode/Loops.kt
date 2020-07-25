package thirtydayofcode

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    val input = scanner.nextInt()
    (1..10).map { number -> (number * input).also { value -> println("$input x $number = $value") } }
}