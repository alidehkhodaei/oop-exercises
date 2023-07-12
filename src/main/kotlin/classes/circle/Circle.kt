package classes.circle

import extensions.isPositive

class Circle(var radius: Double = 1.0) {

    init {
        require(radius.isPositive()){"Radius should be positive"}
    }

    fun getArea(): Double = Math.PI * radius * radius

    fun getCircumference(): Double = 2 * Math.PI * radius

    override fun toString(): String {
        return "Circle[radius=$radius]"
    }

}