package problemsolving

import java.util.*
import kotlin.math.round

private val scanner = Scanner(System.`in`)
fun main() {
    // arr[1]x + arr[0] = arr[3]x + arr[2]  x must >= 0 and it must be integer
    DoubleArray(4) { scanner.nextDouble() }.apply {
        println(
            if (
                ((this[2] - this[0]) / (this[1] - this[3])) >= 0 &&
                round(((this[2] - this[0]) / (this[1] - this[3]))) == ((this[2] - this[0]) / (this[1] - this[3])) &&
                (this[1] - this[3]) != 0.0
            )
                "YES"
            else
                "NO"
        )
    }
}