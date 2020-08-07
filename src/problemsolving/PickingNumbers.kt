package problemsolving

import java.lang.Integer.max
import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    var countOfMax = 2
    IntArray(scanner.nextInt()) { scanner.nextInt() }.also {
        for (items in it) {
            val c = it.count { i -> i == items }
            val d = it.count { i -> i == items - 1 }
            countOfMax = max(countOfMax, c + d)
        }
        print(countOfMax)
    }
}