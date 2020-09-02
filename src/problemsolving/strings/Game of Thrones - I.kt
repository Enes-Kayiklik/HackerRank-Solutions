package problemsolving.strings

fun main() {
    readLine()!!.groupBy { it }.also { map ->
        println(if (map.values.count { it.size % 2 == 1 } < 2) "YES" else "NO")
    }
}