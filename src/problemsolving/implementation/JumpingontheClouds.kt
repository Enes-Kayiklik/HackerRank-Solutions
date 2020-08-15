package problemsolving.implementation

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    IntArray(scanner.nextInt()) { scanner.nextInt() }.also { arr ->
        var jumpCount = 0
        var i = 0
        while (i < arr.size - 2) {
            if (arr[i + 2] == 0) jumpCount++.also { i += 2 }
            else jumpCount++.also { i += 1 }
        }
        println(if (i == arr.size - 1) jumpCount else ++jumpCount)
    }
}