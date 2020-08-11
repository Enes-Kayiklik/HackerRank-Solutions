package mathematics.fundamentals

import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

private val scanner = Scanner(System.`in`)
fun main() {
    Array(scanner.nextInt()) { LongArray(2) { scanner.nextLong() } }.also {
        val minX = it.minBy { arr -> arr[0] }!!
        val maxX = it.maxBy { arr -> arr[0] }!!
        val minY = it.minBy { arr -> arr[1] }!!
        val maxY = it.maxBy { arr -> arr[1] }!!

        val maxDistanceX = (maxX[0] - minX[0]).toDouble()
        val maxDistanceY = (maxY[1] - minY[1]).toDouble()

        println(
            findMax(
                maxDistanceX,
                maxDistanceY,
                maxX.findDistance(maxY),
                maxX.findDistance(minY),
                minX.findDistance(maxY),
                minX.findDistance(minY)
            )
        )
    }
}

private fun LongArray.findDistance(secondArray: LongArray) =
    sqrt((this[0] - secondArray[0]).toDouble().pow(2) + (this[1] - secondArray[1]).toDouble().pow(2))

private fun findMax(vararg numbers: Double) = numbers.max()