package problemsolving.strings

import kotlin.math.abs

fun main() {
    val firstArr = IntArray(26) { 0 }
    val secondArr = IntArray(26) { 0 }
    var sum = 0
    readLine()!!.forEach {
        firstArr[it.toInt() - 97]++
    }

    readLine()!!.forEach {
        secondArr[it.toInt() - 97]++
    }

    for (i in 0 until 26)
        sum += abs(firstArr[i] - secondArr[i])

    println(sum)
}