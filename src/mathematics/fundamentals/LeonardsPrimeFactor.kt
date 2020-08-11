package mathematics.fundamentals

import java.util.*

private val scanner = Scanner(System.`in`)
private val primeNumbers = arrayListOf(
    2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
)

fun main() {
    repeat(scanner.nextInt()) {
        scanner.nextLong().findPrimeFactor()
    }
}

private fun Long.findPrimeFactor() {
    var countOfPrimeFactor = 0
    var result: Long = 1
    for (j in primeNumbers) {
        result *= j
        if (result <= this) {
            countOfPrimeFactor++
        }
    }
    println(countOfPrimeFactor)
}