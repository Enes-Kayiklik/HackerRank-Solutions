package problemsolving.implementation

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    print(IntArray(scanner.nextInt()) { scanner.nextInt() }.groupBy { it }.toSortedMap().maxBy { it.value.size }?.key)
}