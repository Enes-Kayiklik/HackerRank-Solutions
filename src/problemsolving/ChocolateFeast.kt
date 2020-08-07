package problemsolving

import java.util.*

//This is not mine solution
private val scanner = Scanner(System.`in`)
fun main() {
    repeat(scanner.nextInt()) {
        IntArray(3) { scanner.nextInt() }.also { array ->
            val boughtCandies = array[0] / array[1]
            println(boughtCandies + (boughtCandies - 1) / (array[2] - 1))
        }
    }
}