package problemsolving.implementation

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    val size = scanner.nextInt()
    val difference = scanner.nextInt()
    var output = 0
    IntArray(size) { scanner.nextInt() }.also { arr ->
        arr.forEach {
            if ((it + difference) in arr && (it + 2 * difference) in arr)
                output++
        }
        print(output)
    }
}