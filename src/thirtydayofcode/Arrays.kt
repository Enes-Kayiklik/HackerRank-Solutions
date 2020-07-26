package thirtydayofcode

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    IntArray(scanner.nextInt()) { scanner.nextInt() }.reversed().forEach { print("$it ") }
}