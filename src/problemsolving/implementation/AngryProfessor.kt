package problemsolving.implementation

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    repeat(scanner.nextInt()) {
        var countOfCanceled = 0
        val arr = IntArray(scanner.nextInt() + 1) { scanner.nextInt().also { if (it <= 0) countOfCanceled++ } }
        println(if (arr[0] <= countOfCanceled) "NO" else "YES")
    }
}