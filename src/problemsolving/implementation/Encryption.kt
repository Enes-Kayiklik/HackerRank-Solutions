package problemsolving.implementation

import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.sqrt

fun main() {
    val s = readLine()!!.replace(" ", "")
    var rowCount = floor(sqrt(s.length.toDouble())).toInt()
    val columnCount = ceil(sqrt(s.length.toDouble())).toInt()
    if (columnCount == rowCount) rowCount -= 1
    for (j in 0..rowCount) {
        for (i in j until s.length step columnCount)
            print(s[i])
        print(" ")
    }
}