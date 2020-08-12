package problemsolving.search

import java.util.*
import kotlin.collections.ArrayList

private val scanner = Scanner(System.`in`)
fun main() {
    val subArr = ArrayList<Int>().also { list -> repeat(scanner.nextInt()) { list.add(scanner.nextInt()) } }
    val arr = ArrayList<Int>().also { list -> repeat(scanner.nextInt()) { list.add(scanner.nextInt()) } }

    val missing = ArrayList<Int>()
    for (n in arr) {
        if (n in subArr) subArr.remove(n)
        else missing.add(n)
    }
    println(missing.toSortedSet().joinToString(" "))
}