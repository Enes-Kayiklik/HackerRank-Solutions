package problemsolving.strings

import java.util.*
import kotlin.math.abs

private val scanner = Scanner(System.`in`)
fun main() {
    repeat(scanner.nextInt()) {
        println(scanner.next().isFunny())
    }
}

fun String.isFunny(): String {
    val reversed = this.reversed()

    for (i in 0..reversed.length - 2) {
        if (abs(reversed[i] - reversed[i + 1]) != abs(this[i] - this[i + 1])) return "Not Funny"
    }
    return "Funny"
}