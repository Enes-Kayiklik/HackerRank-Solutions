package problemsolving.strings

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    scanner.nextInt()
    val string = scanner.next()
    val k = scanner.nextInt() % 26
    val aToZ = ('a'..'z').toList()
    string.forEach { c ->
        if (c.isLetter()) {
            if (c.isUpperCase())
                print(aToZ[(aToZ.indexOf(c.toLowerCase()) + k) % 26].toUpperCase())
            else
                print(aToZ[(aToZ.indexOf(c) + k) % 26])
        } else print(c)
    }
}