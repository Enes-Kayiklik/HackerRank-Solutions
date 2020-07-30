package thirtydayofcode

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    var maxRepeat = 0
    var numOFRepeat = 0
    Integer.toBinaryString(scanner.nextInt()).forEach { char ->
        if (char == '1') {
            numOFRepeat += 1
            if (numOFRepeat > maxRepeat)
                maxRepeat = numOFRepeat
        } else {
            numOFRepeat = 0
        }
    }
    println(maxRepeat)
}