package mathematics

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    repeat(scanner.nextInt()) {
        IntArray(2) { scanner.nextInt() }.apply {
            val gcd = findGcd()
            println((this[0] / gcd) * (this[1] / gcd))
        }
    }
}

private fun IntArray.findGcd(): Int {
    var gcd = 1
    for (i in 1..this.min()!!) {
        if (this[0] % i == 0 && this[1] % i == 0) {
            gcd = i
        }
    }
    return gcd
}