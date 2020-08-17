package thirtydayofcode

fun main() {
    val (d1, m1, y1) = readLine()!!.split(" ")
    val (d2, m2, y2) = readLine()!!.split(" ")

    println(
        when {
            y1.toInt() < y2.toInt() -> 0
            y1.toInt() > y2.toInt() -> 10000
            m1.toInt() > m2.toInt() -> (m1.toInt() - m2.toInt()) * 500
            d1.toInt() > d2.toInt() -> (d1.toInt() - d2.toInt()) * 15
            else -> 0
        }
    )
}