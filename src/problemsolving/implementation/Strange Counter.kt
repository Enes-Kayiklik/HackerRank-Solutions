package problemsolving.implementation

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    var t = scanner.nextLong()
    var value = 3L
    while (t > value) {
        t -= value
        value *= 2
    }
    println(value - t + 1)
}