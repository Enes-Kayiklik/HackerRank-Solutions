package problemsolving.strings

fun main() {
    println(solution(readLine()!!))
}

fun solution(string: String): String {
    val arr = IntArray(26) { 0 }
    for (i in string) {
        arr[i - 'a']++
    }
    arr.sort()
    val nonZero = arr.filter { it != 0 }
    if (nonZero.last() == nonZero.first() ||
        ((nonZero[nonZero.size - 1] - 1 == nonZero.first()) && nonZero[nonZero.size - 2] == nonZero.first()) ||
        ((nonZero.last() == nonZero.first() + 1) && nonZero.getOrNull(1) == nonZero.last()) ||
        (nonZero.count { it == 1 } == 1 && nonZero.getOrNull(1) == nonZero.last())
    )
        return "YES"
    return "NO"
}