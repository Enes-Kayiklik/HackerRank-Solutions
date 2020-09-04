package problemsolving.implementation

fun main() {
    repeat(readLine()!!.toInt()) {
        val (n, m, s) = readLine()!!.split(" ").map { it.toLong() }
        println(((s - 1 + m - 1) % n) + 1)
    }
}