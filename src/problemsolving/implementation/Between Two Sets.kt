package problemsolving.implementation

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    val sizeOne = scanner.nextInt()
    val sizeTwo = scanner.nextInt()
    IntArray(sizeOne) { scanner.nextInt() }.sorted().also { arrOne ->
        IntArray(sizeTwo) { scanner.nextInt() }.sorted().also { arrTwo ->
            val outputList = mutableListOf<Int>()
            for (i in arrOne.last()..arrTwo.first()) {
                if (arrOne.all { i % it == 0 } && arrTwo.all { it % i == 0 })
                    outputList.add(i)
            }
            println(outputList.size)
        }
    }
}
