package mathematics.fundamentals

import java.math.BigInteger

fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toBigInteger() }
    println(n * m - BigInteger("1", 2))
}