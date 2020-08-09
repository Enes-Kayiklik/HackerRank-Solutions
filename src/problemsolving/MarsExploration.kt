package problemsolving

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    var num = 0
    scanner.next().also { input ->
        for (i in input.indices) {
            if ("SOS"[i % 3] != input[i]) num++
        }
        print(num)
    }
}