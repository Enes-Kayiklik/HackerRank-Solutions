package problemsolving.sorting

import java.util.*

private val scanner = Scanner(System.`in`)
fun main() {
    val listOfOutput: ArrayList<Long> = arrayListOf()
    val size = scanner.nextInt()
    LongArray(size) { scanner.nextLong() }.sortedArray().also { currentArr ->
        var minDist = currentArr[1] - currentArr[0]
        for (i in 0 until size - 1) {
            val j = i + 1
            if (currentArr[j] - currentArr[i] < minDist) {
                listOfOutput.clear()
                minDist = currentArr[j] - currentArr[i]
            }
            if (currentArr[j] - currentArr[i] == minDist) {
                listOfOutput.add(currentArr[i])
                listOfOutput.add(currentArr[j])
            }
        }
        println(listOfOutput.joinToString(" "))
    }
}