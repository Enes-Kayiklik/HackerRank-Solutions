package problemsolving.strings

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    scanner.nextLine().toLowerCase().also { string ->
        println(
            if (('a'..'z').all { char -> char in string } && ' ' in string) "pangram"
            else "not pangram"
        )
    }
}