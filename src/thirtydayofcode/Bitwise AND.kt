package thirtydayofcode

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    repeat(scanner.nextInt()) {
        val max = scanner.nextInt()
        val search = scanner.nextInt()
        var result = 0
        for (i in 1 until max)
            for (j in (i + 1)..max) {
                val andOperator = i.and(j)
                if (andOperator in (result + 1) until search)
                    result = andOperator
            }
        println(result)
    }
}