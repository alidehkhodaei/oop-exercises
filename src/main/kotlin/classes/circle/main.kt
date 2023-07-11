package classes.circle

fun main() {
    val c1 = Circle(1.1)
    println(c1)
    val c2 = Circle()
    println(c2)

    c1.radius = 2.2
    println(c1)
    println("radius is: " + c1.radius)

    println("area is: %.2f".format(c1.getArea()))
    println("circumference is: %.2f".format(c1.getCircumference()))
}
