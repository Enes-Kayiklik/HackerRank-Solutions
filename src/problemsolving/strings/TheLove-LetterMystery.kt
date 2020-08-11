package problemsolving.strings

import java.util.*
import kotlin.math.abs

private val scanner = Scanner(System.`in`)
fun main() {
    repeat(scanner.nextInt()) {
        var count = 0
        scanner.next().also { string ->
            for (i in 0 until string.length / 2) {
                count += abs(string[i] - string[string.length - (i + 1)])
            }
        }
        println(count)
    }
}