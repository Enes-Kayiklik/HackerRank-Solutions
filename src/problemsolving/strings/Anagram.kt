package problemsolving.strings

import kotlin.math.abs

fun main() {
    repeat(readLine()!!.toInt()) {
        readLine()!!.also {
            val length = it.length
            if (length % 2 == 0) {
                var sum = 0
                val firstArr = IntArray(26) { 0 }
                val secondArr = IntArray(26) { 0 }
                for (i in 0 until length / 2)
                    firstArr[it[i] - 'a']++
                for (i in length / 2 until length)
                    secondArr[it[i] - 'a']++
                for (i in 0 until 26)
                    sum += abs(firstArr[i] - secondArr[i])
                println(sum / 2)
            } else {
                println(-1)
            }
        }
    }
}