package thirtydayofcode

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    LongArray(scanner.nextInt()) { scanner.nextLong() }.also { arr ->
        var numOfSwap = 0
        for (i in arr.indices) {
            for (j in 0 until arr.size - 1) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j + 1].also { arr[j + 1] = arr[j] }
                    numOfSwap++
                }
            }
        }
        println(
            """
            Array is sorted in $numOfSwap swaps.
            First Element: ${arr.first()}
            Last Element: ${arr.last()}
        """.trimIndent()
        )
    }
}