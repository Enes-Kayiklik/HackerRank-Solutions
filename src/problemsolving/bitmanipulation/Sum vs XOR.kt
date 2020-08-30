package problemsolving.bitmanipulation

import java.math.BigInteger
import java.util.*
import kotlin.math.pow

private val scanner = Scanner(System.`in`)
fun main() {
    val number = scanner.nextLong()
    val numberOfZero = BigInteger.valueOf(number).toString(2).count { it == '0' }
    if (number == 0L) println(1)
    else println(2.0.pow(numberOfZero).toLong())
}