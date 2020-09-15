package problemsolving.implementation

private val timeList = listOf(
    "zero",
    "one",
    "two",
    "three",
    "four",
    "five",
    "six",
    "seven",
    "eight",
    "nine",
    "ten",
    "eleven",
    "twelve",
    "thirteen",
    "fourteen",
    "fifteen",
    "sixteen",
    "seventeen",
    "eighteen",
    "nineteen",
    "twenty",
    "twenty one",
    "twenty two",
    "twenty three",
    "twenty four",
    "twenty five",
    "twenty six",
    "twenty seven",
    "twenty eight",
    "twenty nine"
)

fun main() {
    val hour = readLine()!!.toInt()
    val minute = readLine()!!.toInt()
    when {
        minute < 30 -> {
            smaller(hour, minute)
        }
        minute > 30 -> {
            bigger(hour, minute)
        }
        else -> {
            println("half past ${timeList[hour]}")
        }
    }
}

private fun smaller(hour: Int, minute: Int) {
    println(
        when (minute) {
            0 -> "${timeList[hour]} o' clock"
            1 -> "${timeList[minute]} minute past ${timeList[hour]}"
            15 -> "quarter past ${timeList[hour]}"
            else -> "${timeList[minute]} minutes past ${timeList[hour]}"
        }
    )
}

private fun bigger(hour: Int, minute: Int) {
    println(
        when (minute) {
            45 -> "quarter to ${timeList[hour + 1]}"
            else -> "${timeList[60 - minute]} minutes to ${timeList[hour + 1]}"
        }
    )
}