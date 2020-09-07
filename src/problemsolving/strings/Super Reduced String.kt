package problemsolving.strings

fun main() {
    readLine()!!.also {
        var outputString = it
        var i = 1
        while (i < outputString.length) {
            if (outputString[i - 1] == outputString[i]) {
                outputString = outputString.substring(0, i - 1).plus(outputString.substring(i + 1))
                i = 0
            }
            i++
        }
        println(if (outputString.isEmpty()) "Empty String" else outputString)
    }
}