package problemsolving.greedy

fun main() {
    repeat(readLine()!!.toInt()) {
        println(findNum(readLine()!!.toInt()))
    }
}

private fun findNum(digit: Int): StringBuilder {
    var i = digit - digit % 3
    val outputString = StringBuilder("")
    loop@ while (i >= 0) {
        if ((digit - i) % 5 == 0) {
            repeat(i / 3) { outputString.append("555") }
            repeat((digit - i) / 5) { outputString.append("33333") }
            break@loop
        } else i -= 3
    }
    return if (outputString.isEmpty()) StringBuilder("-1") else outputString
}