package problemsolving.implementation

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    val size = scanner.nextInt()
    IntArray(size) { scanner.nextInt() }.also { arr ->
        println(arr.find(size))
    }
}

private fun IntArray.find(size: Int): String {
    var move = 0
    for (i in 0 until size - 1) {
        if (this[i] % 2 == 1) {
            this[i]++.also { this[i + 1]++; move += 2 }
        }
    }
    if (this.all { it % 2 == 0 }) return move.toString()
    return "NO"
}