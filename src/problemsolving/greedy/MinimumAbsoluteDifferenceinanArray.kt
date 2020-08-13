package problemsolving.greedy

import java.util.*
import kotlin.math.abs

private val scanner = Scanner(System.`in`)
fun main() {
    LongArray(scanner.nextInt()) { scanner.nextLong() }.sortedArray().also { arr ->
        var minDist = abs(arr[0] - arr[1])
        for (n in 0 until arr.size - 1) {
            val currentDist = abs(arr[n] - arr[n + 1])
            if (currentDist < minDist) minDist = currentDist
        }
        print(minDist)
    }
}