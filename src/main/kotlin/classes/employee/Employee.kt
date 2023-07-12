package classes.employee

import extensions.isPositive
import extensions.isPositiveOrZero

class Employee(val id:Int, val firstName: String,val lastName: String, salary: Int){

    var salary: Int=0
        set(value) {
            require(value.isPositiveOrZero()) { "The salary must be positive or zero" }
            field = value
        }

    init {
        require(id.isPositive()) { "The id must be positive" }
        this.salary=salary
    }

    fun getName() = "$firstName $lastName"
    fun getAnnualSalary() = salary * MONTH_COUNT
    fun raiseSalary(percent: Int): Int {
        require(percent in MIN_SALARY_PERCENTAGE..MAX_SALARY_PERCENTAGE) { "The percent must be between $MIN_SALARY_PERCENTAGE and $MAX_SALARY_PERCENTAGE" }
        salary += (salary * percent / MAX_SALARY_PERCENTAGE)
        return salary
    }

    override fun toString(): String {
        return "Employee[id=$id, name=$firstName $lastName, salary=$salary"
    }

    companion object {
        private const val MONTH_COUNT = 12
        private const val MAX_SALARY_PERCENTAGE = 100
        private const val MIN_SALARY_PERCENTAGE = 0
    }
}