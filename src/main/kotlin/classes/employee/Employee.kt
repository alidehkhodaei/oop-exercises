package classes.employee

import extensions.isPositive

class Employee(
    val id: Int, val firstName: String,
    val lastName: String, var salary: Int
) {

    init {
        require(id.isPositive()){"Id should be positive"}
        require(salary.isPositive()){"Salary should be positive"}
    }

    companion object{
        private const val MONTH_COUNT=12
        private const val TOTAL_PERCENTAGE = 100
    }

    fun getName() = "$firstName $lastName"

    fun getAnnualSalary() = salary * MONTH_COUNT

    fun raiseSalary(percent: Int): Int {
        salary += (salary * percent / TOTAL_PERCENTAGE)
        return salary
    }

    override fun toString(): String {
        return "Employee[id=$id, name=$firstName $lastName, salary=$salary"
    }

}
