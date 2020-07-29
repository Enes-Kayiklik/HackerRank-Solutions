package thirtydayofcode

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    println(scanner.nextInt().factorial())
}

fun Int.factorial(): Int = if (this <= 1) 1 else this * this.minus(1).factorial()