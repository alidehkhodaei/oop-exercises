package others.student

fun main() {
    val ahTeck = Student("Tan Ah Teck", "1 Happy Ave")
    println(ahTeck)

    ahTeck.address = "8 Kg Java"
    println(ahTeck)
    println(ahTeck.name)
    println(ahTeck.address)

    ahTeck.addCourseGrade("IM101", 89)
    ahTeck.addCourseGrade("IM102", 57)
    ahTeck.addCourseGrade("IM103", 96)
    ahTeck.printGrades()
    println("The average grade is %.2f".format(ahTeck.calculateAverageGrade()))
}