package problemsolving.implementation

fun main() {
    val year = readLine()!!.toInt()
    println(
        when (year) {
            1918 -> {
                "26.09.1918"
            }
            else -> {
                if (((year <= 1917) && (year % 4 == 0)) || ((year > 1918) && (year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0)))))
                    "12.09.$year"
                else
                    "13.09.$year"
            }
        }
    )
}