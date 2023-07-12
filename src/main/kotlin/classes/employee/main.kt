package classes.employee


fun main() {
    val e1 = Employee(8, "Peter", "Tan", 2500)
    println(e1)

    e1.salary = 999
    println(e1)
    println("id is: " + e1.id)
    println("salary is: " + e1.salary)
    println("name is: " + e1.getName())
    println("annual salary is: " + e1.getAnnualSalary())

    println(e1.raiseSalary(10))
    println(e1)
}
