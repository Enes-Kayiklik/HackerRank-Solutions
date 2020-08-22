package problemsolving.implementation

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    repeat(scanner.nextInt()) {
        println(isHappy(scanner.nextInt(), scanner.next()))
    }
}

private fun isHappy(size: Int, string: String): String {
    for (a in string) {
        if (a != '_' && string.count { it == a } == 1) return "NO"
    }

    if (string.count { it == '_' } == 0) {
        for (i in 1 until size) if (string[i - 1] != string[i] && string[i + 1] != string[i]) return "NO"
    }
    return "YES"
}