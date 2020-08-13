package problemsolving.greedy

import java.util.*
import kotlin.math.pow

private val scanner = Scanner(System.`in`)
fun main() {
    IntArray(scanner.nextInt()) { scanner.nextInt() }.sorted().reversed().also { arr ->
        var sum = 0L
        for (n in arr.indices) {
            sum += arr[n] * 2f.pow(n).toLong()
        }
        print(sum)
    }
}