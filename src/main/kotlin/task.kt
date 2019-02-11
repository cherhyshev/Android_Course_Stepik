fun main(args: Array<String>) {
    println(calcBugMoneyValue(10, 2, 25))
}

fun calcBugMoneyValue(dayNumber: Int, bugRank: Int, cashAmount: Int): Int {
    return (dayNumber * bugRank + 42) * cashAmount

}