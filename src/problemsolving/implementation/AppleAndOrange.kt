package problemsolving.implementation

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    val houseStart = scanner.nextLong()
    val houseEnd = scanner.nextLong()
    val appleTree = scanner.nextLong()
    val orangeTree = scanner.nextLong()
    val sizeApple = scanner.nextInt()
    val sizeOrange = scanner.nextInt()

    println(LongArray(sizeApple) { scanner.nextLong() }.filter { it + appleTree in houseStart..houseEnd }.size)
    println(LongArray(sizeOrange) { scanner.nextLong() }.filter { it + orangeTree in houseStart..houseEnd }.size)
}