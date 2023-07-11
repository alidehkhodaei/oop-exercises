package classes.circle

import extensions.isPositive

class Circle {

    var radius: Double
        set(value) {
            require(value.isPositive()) { "The radius must be positive" }
            field = value
        }

    constructor(radius: Double = 1.0) {
        this.radius = radius
    }

    fun getArea(): Double = Math.PI * radius * radius

    fun getCircumference(): Double = 2 * Math.PI * radius

    override fun toString(): String {
        return "Circle[radius=$radius]"
    }

}