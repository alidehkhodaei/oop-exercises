package classes.date

fun main() {
    val d1 = Date(1, 2, 2014)
    println(d1)

    d1.month = 12
    d1.day = 9
    d1.year = 2099
    println(d1)
    println("Month: " + d1.month)
    println("Day: " + d1.day)
    println("Year: " + d1.year)

    d1.setDate(3, 4, 2016)
    println(d1)
}