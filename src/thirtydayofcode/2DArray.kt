package thirtydayofcode

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    Array(6) { IntArray(6) { scanner.nextInt() } }
        .also {
            val sumArr = IntArray(16)
            var h = 0
            for (i in 0 until 4) {
                for (j in 0 until 4) {
                    sumArr[h++] = it[i][j] + it[i][j + 1] + it[i][j + 2] +
                            it[i + 2][j + 2] +
                            it[i + 1][j + 1] + it[i + 2][j] + it[i + 2][j + 1]

                }
            }
            print(sumArr.max())
        }
}