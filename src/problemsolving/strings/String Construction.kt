package problemsolving.strings

fun main() {
    repeat(readLine()!!.toInt()) {
        println(readLine()!!.groupBy { it }.size)
    }
}