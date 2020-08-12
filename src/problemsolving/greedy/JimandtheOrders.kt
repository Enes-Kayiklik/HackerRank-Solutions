package problemsolving.greedy

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    val timeArr = hashMapOf<Long, Int>()
    repeat(scanner.nextInt()) {
        timeArr[scanner.nextLong() + scanner.nextLong()] = it + 1
    }.also { timeArr.toSortedMap().forEach { (_, u) -> print("$u ") } }
}