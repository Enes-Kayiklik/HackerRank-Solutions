package mathematics.fundamentals

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    repeat(scanner.nextInt()) {
        var multiple: Long = 1
        LongArray(scanner.nextInt() - 1) {
            scanner.nextLong().also { multiple *= it; multiple %= 1234567 }
        }.also { println(multiple) }
    }
}