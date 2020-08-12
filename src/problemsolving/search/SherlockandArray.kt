package problemsolving.search

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    repeat(scanner.nextInt()) {
        List(scanner.nextInt()) { scanner.nextInt() }.also { arr ->
            println(solve(arr))
        }
    }
}

private fun solve(arr: List<Int>): String {
    var sum = arr.sum()
    var left = 0
    for (n in arr.indices) {
        val current = arr[n]
        sum -= current
        if (left == sum) return "YES"
        left += current
    }
    return "NO"
}