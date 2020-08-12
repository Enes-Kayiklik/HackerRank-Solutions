package problemsolving.greedy

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    repeat(scanner.nextInt()) {
        val size = scanner.nextInt()
        val sum = scanner.nextLong()
        val arrOne = LongArray(size) { scanner.nextLong() }
        val arrTwo = LongArray(size) { scanner.nextLong() }

        if (arrTwo.all { it == 1L }) {
            println("NO")
            return@repeat
        }
        println(
            if (arrOne.sum() + arrTwo.sum() >= size * sum) "YES"
            else "NO"
        )
    }
}