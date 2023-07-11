package classes.rectangle

fun main() {

    val r1 = Rectangle(1.2f, 3.4f)
    println(r1)
    val r2 = Rectangle()
    println(r2)

    r1.length = 5.6f
    r1.width = 7.8f
    println(r1)
    println("length is: " + r1.length)
    println("width is: " + r1.width)

    println("area is: %.2f".format(r1.getArea()))
    println("perimeter is: %.2f".format(r1.getPerimeter()))
}

