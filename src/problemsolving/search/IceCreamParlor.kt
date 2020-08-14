package problemsolving.search

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    repeat(scanner.nextInt()) {
        val money = scanner.nextInt()
        val flavorSize = scanner.nextInt()
        IntArray(flavorSize) { scanner.nextInt() }.also { arr ->
            upper@ for (i in arr.indices) {
                for (j in i + 1 until arr.size) {
                    if (arr[i] + arr[j] == money) {
                        println("${i + 1} ${j + 1}")
                        break@upper
                    }
                }
            }
        }
    }
}