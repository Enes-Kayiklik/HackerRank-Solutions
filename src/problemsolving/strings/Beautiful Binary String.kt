package problemsolving.strings

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    scanner.nextInt().also { size ->
        var count = 0
        var i = 0
        scanner.next().also { string ->
            while (i < size - (size % 3 + 1)) {
                if (string.substring(i, i + 3) == "010") count++.also { i += 3 }
                else i++
            }
            println(count)
        }
    }
}