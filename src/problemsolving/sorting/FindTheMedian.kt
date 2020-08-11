package problemsolving.sorting

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    val size = scanner.nextInt()
    print(IntArray(size) { scanner.nextInt() }.sortedArray()[size / 2])
}