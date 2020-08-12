package problemsolving.bitmanipulation

import java.util.*
import kotlin.math.pow

private val scanner = Scanner(System.`in`)
fun main() {
    repeat(scanner.nextInt()) {
        println((2.0).pow(32).toLong() - 1 - scanner.nextLong())
    }
}