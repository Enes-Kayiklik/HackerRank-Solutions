package thirtydayofcode

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    val map = HashMap<String, String>()
    val itemsNum = scanner.nextInt()
    repeat(itemsNum) {
        map[scanner.next()] = scanner.next()
    }

    repeat(itemsNum) {
        val input = scanner.next()
        println(map[input].let {
            if (it != null) "$input=$it"
            else "Not Found"
        })
    }
}