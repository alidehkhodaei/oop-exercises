package classes.rectangle

import extensions.isPositive

class Rectangle {

    var length: Float
        set(value) {
            require(value.isPositive()) { "The length must be positive" }
            field = value
        }

    var width: Float
        set(value) {
            require(value.isPositive()) { "The width must be positive" }
            field = value
        }

    constructor() : this(DEFAULT_VALUE, DEFAULT_VALUE)

    constructor(length: Float, width: Float) {
        this.length = length
        this.width = width
    }

    fun getArea(): Double = (length * width).toDouble()

    fun getPerimeter(): Double = (2 * (length + width)).toDouble()

    override fun toString(): String {
        return "Rectangle[length=$length, width=$width"
    }

    companion object {
        private const val DEFAULT_VALUE = 1.0f
    }
}