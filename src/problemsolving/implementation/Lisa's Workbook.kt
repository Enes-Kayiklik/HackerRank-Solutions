package problemsolving.implementation

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    val (size, k) = readLine()!!.split(' ')
    IntArray(size.toInt()) { scanner.nextInt() }.also { arr ->
        var page = 1
        var lucky = 0
        for (i in arr) {
            for (j in 1..i) {
                if (j == page) lucky++
                if (j % k.toInt() == 0) page++
            }
            if (i % k.toInt() != 0) page++
        }
        println(lucky)
    }
}