package problemsolving.bitmanipulation

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    val l = scanner.nextInt()
    val r = scanner.nextInt()
    var max = 0
    for (i in l..r) {
        for (j in i..r) if (i.xor(j) > max) max = i.xor(j)
    }
    println(max)
}