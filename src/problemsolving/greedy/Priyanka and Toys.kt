package problemsolving.greedy

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    IntArray(scanner.nextInt()) { scanner.nextInt() }.sorted().also { list ->
        var currentNum = list.first()
        var containerSize = 1
        list.forEach {
            if (it - currentNum > 4)
                currentNum = it.also { containerSize++ }
        }
        println(containerSize)
    }
}