package problemsolving

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    scanner.next().also { string ->
        scanner.nextLong().also { number ->
            print((number / string.length) * string.count { c -> c == 'a' } +
                    string.substring(0, (number % string.length).toInt()).count { c -> c == 'a' })
        }
    }
}