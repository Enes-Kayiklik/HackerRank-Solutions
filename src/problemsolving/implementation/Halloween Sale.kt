package problemsolving.implementation

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    var p = scanner.nextInt()
    val d = scanner.nextInt()
    val m = scanner.nextInt()
    var s = scanner.nextInt()
    var numberOfCanBuy = 0
    while (s - p >= 0) {
        s -= p
        p = (p - d).coerceAtLeast(m)
        numberOfCanBuy++
    }
    println(numberOfCanBuy)
}