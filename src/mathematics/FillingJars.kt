package mathematics

import java.util.*
import kotlin.math.abs
import kotlin.math.floor

private val scanner = Scanner(System.`in`)
fun main() {
    val countOfJar = scanner.nextLong()
    var average = 0.0
    repeat(scanner.nextInt()) {
        average += (abs(scanner.nextLong() - scanner.nextLong()) + 1) * scanner.nextLong()
    }
    println(floor(average / countOfJar).toLong())
}