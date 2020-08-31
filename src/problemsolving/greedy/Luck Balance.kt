package problemsolving.greedy

fun main() {
    val (size, k) = readLine()?.split(" ")!!.map { it.toInt() }
    val important = arrayListOf<Int>()
    val unImportant = arrayListOf<Int>()
    var importantSize = 0
    repeat(size) {
        val (li, ti) = readLine()?.split(" ")!!.map { it.toInt() }
        if (ti == 1) important.add(li).also { importantSize++ }
        else unImportant.add(li)
    }
    val sorted = important.sorted().reversed()
    if (k < importantSize)
        println(unImportant.sum() + sorted.subList(0, k).sum() - sorted.subList(k, importantSize).sum())
    else
        println(unImportant.sum() + sorted.sum())
}