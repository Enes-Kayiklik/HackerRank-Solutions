package problemsolving.strings

import java.util.*
import kotlin.math.max

private val scanner = Scanner(System.`in`)
fun main() {
    scanner.nextInt().also { size ->
        var count = 0
        scanner.next().also { string ->
            if (string.any { it in 'a'..'z' }) count++
            if (string.any { it in 'A'..'Z' }) count++
            if (string.any { it in '0'..'9' }) count++
            if (string.any { it in "!@#\$%^&*()-+" }) count++
        }
        print(max(4 - count, 6 - size))
    }
}