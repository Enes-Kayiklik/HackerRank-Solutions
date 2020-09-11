package problemsolving.strings

fun main() {
    repeat(readLine()!!.toInt()) {
        println(makeSolution(readLine()!!, readLine()!!))
    }
}

private fun makeSolution(stringOne: String, stringTwo: String): String {
    stringOne.toSet().forEach {
        if (it in stringTwo.toSet())
            return "YES"
    }
    return "NO"
}
