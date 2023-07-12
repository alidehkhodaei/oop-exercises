package classes.rectangle

import extensions.isPositive

class Rectangle(var length: Float , var width: Float ) {

    init {
        require(width.isPositive()) { "Width should be positive" }
        require(length.isPositive()) { "Length should be positive" }
    }

    constructor() : this(DEFAULT_VALUE, DEFAULT_VALUE)

    companion object {
        private const val DEFAULT_VALUE = 1.0f
    }

    fun getArea(): Double = (length * width).toDouble()

    fun getPerimeter(): Double = (2 * (length + width)).toDouble()

    override fun toString(): String {
        return "Rectangle[length=$length, width=$width"
    }
}