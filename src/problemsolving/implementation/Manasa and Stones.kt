package problemsolving.implementation

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    repeat(scanner.nextInt()) {
        val n = scanner.nextInt()
        val a = scanner.nextInt()
        val b = scanner.nextInt()
        val outputList = arrayListOf<Int>()

        for (k in 0 until n)
            outputList.add(a * k + b * (n - k - 1))

        println(outputList.toSortedSet().joinToString(" "))
    }
}