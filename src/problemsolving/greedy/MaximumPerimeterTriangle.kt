package problemsolving.greedy

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    val size = scanner.nextInt()
    LongArray(size) { scanner.nextLong() }.sortedArray().also { arr ->
        var i = size - 3
        while (i >= 0 && arr[i] + arr[i + 1] <= arr[i + 2]) {
            i--
        }

        println(
            if (i >= 0) "${arr[i]} ${arr[i + 1]} ${arr[i + 2]}"
            else -1
        )
    }
}