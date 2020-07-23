package problemsolving

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    // character can jump maximum of arr[0] unit. k = arr[0]
    val arr = IntArray(scanner.nextInt() + 1) { scanner.nextInt() }
    // arr[0] always equal itself
    val countOfDoses = arr.max()!!.minus(arr[0])
    println(if (countOfDoses < 0) 0 else countOfDoses)
}