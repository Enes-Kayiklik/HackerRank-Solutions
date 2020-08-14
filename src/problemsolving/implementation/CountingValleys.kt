package problemsolving.implementation

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    var valleyCount = 0
    var altitude = 0
    scanner.nextInt()
    val arr = scanner.next()

    arr.forEach { char ->
        if (char == 'U') altitude++
        else altitude--

        if (altitude == 0 && char == 'U') valleyCount++
    }.also { println(valleyCount) }
}