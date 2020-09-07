package problemsolving.strings

fun main() {
    var output = ('a'..'z').toSet()
    repeat(readLine()!!.toInt()) {
        output = readLine()!!.toSet().intersect(output)
    }
    println(output.size)
}