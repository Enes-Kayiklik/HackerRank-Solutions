package problemsolving.implementation

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    repeat(scanner.nextInt()) {
        LongArray(5) { scanner.nextLong() }.also { arr ->
            println(
                listOf(
                    arr[0] * arr[2] + arr[1] * arr[3],
                    (arr[0] + arr[1]) * arr[2] + arr[1] * arr[4],
                    (arr[0] + arr[1]) * arr[3] + arr[0] * arr[4]
                ).min()
            )
        }
    }
}