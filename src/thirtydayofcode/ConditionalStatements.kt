package thirtydayofcode

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    scanner.nextInt().also { input ->
        println(
            if (input.isOdd()) "Weird"
            else when (input) {
                in 2..5 -> "Not Weird"
                in 6..20 -> "Weird"
                else -> "Not Weird"
            }
        )
    }
}

private fun Int.isOdd(): Boolean = this % 2 != 0