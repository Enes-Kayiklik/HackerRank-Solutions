package problemsolving

import java.util.*
import kotlin.math.floor

private val scanner = Scanner(System.`in`)
fun main() {
    var liked = 2.0
    var cumulative = 2.0
    repeat(scanner.nextInt() - 1) {
        liked = floor((liked * 3) / 2)
        cumulative += liked
    }
    println(cumulative.toLong())
}