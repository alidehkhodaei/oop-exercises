package classes.time

fun main() {
    val t1 = Time(1, 2, 3)
    println(t1)

    t1.hour=4
    t1.minute=5
    t1.second=6
    println(t1)
    println("Hour: " + t1.hour)
    println("Minute: " + t1.minute)
    println("Second: " + t1.second)

    t1.setTime(23, 59, 58)
    println(t1)

    println(t1.nextSecond())
    println(t1.nextSecond().nextSecond())

    println(t1.previousSecond())
    println(t1.previousSecond().previousSecond())

}