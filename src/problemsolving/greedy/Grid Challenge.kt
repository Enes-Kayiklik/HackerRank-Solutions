package problemsolving.greedy

fun main() {
    repeat(readLine()!!.toInt()) {
        val size = readLine()!!.toInt()
        val list = List(size) { readLine()!!.toCharArray().sorted() }
        println(isSorted(list, size))
    }
}

private fun isSorted(list: List<List<Char>>, size: Int): String {
    for (i in 0 until size - 1) {
        val first = list[i]
        val second = list[i + 1]
        for (j in first.indices) {
            if (first[j] > second[j]) return "NO"
        }
    }
    return "YES"
}