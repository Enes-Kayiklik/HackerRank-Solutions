package thirtydayofcode

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    repeat(scanner.nextInt()) {
        scanner.next().apply {
            this.filterIndexed { index, char ->
                if (index.isEven()) print(char)
                true
            }
            print(" ")
            this.filterIndexed { index, char ->
                if (!index.isEven()) print(char)
                true
            }
            println()
        }
    }
}

private fun Int.isEven(): Boolean = this % 2 == 0