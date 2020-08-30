package problemsolving.implementation

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    val size = scanner.nextInt()
    Array(size) { scanner.next().toCharArray() }.also { arr ->
        for (i in 1 until size - 1) {
            for (j in 1 until size - 1) {
                if (arr[i][j] > arr[i - 1][j] &&
                    arr[i][j] > arr[i + 1][j] &&
                    arr[i][j] > arr[i][j - 1] &&
                    arr[i][j] > arr[i][j + 1]
                ) arr[i][j] = 'X'
            }
        }
        for (i in arr) {
            println(i.joinToString(""))
        }
    }
}