package classes.rectangle

class Rectangle(var length: Float , var width: Float ) {

    constructor():this(1.0f,1.0f)

    fun getArea(): Double = (length * width).toDouble()

    fun getPerimeter(): Double = ((2 * length) + (2 * width)).toDouble()

    override fun toString(): String {
        return "Rectangle[length=$length, width=$width"
    }
}