package problemsolving.implementation

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    val size = scanner.nextInt()
    val distance = scanner.nextInt()
    var currentEnergy = 100
    IntArray(size) { scanner.nextInt() }.also { arr ->
        var i = distance % size
        currentEnergy -= arr[i] * 2 + 1

        while (i != 0) {
            i = (i + distance) % size
            currentEnergy -= arr[i] * 2 + 1
        }
        println(currentEnergy)
    }
}