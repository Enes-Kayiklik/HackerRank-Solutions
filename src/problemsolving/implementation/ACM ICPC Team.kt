package problemsolving.implementation

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    val sizeOne = scanner.nextInt()
    val sizeTwo = scanner.nextInt()
    val array = arrayListOf<String>()
    repeat(sizeOne) {
        array.add(scanner.next())
    }
    
    var count = 0
    var biggest = 0
    for (i in array.indices) {
        for (j in i until sizeOne) {
            var orValue = 0
            for (k in 0 until sizeTwo) {
                if (array[i][k] == '1' || array[j][k] == '1') orValue++
            }

            if (orValue > biggest) biggest = orValue.also { count = 0 }
            if (orValue == biggest) count++
        }
    }

    println("$biggest\n$count")
}