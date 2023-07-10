package other.student

class Student(val name: String, var address: String) {

    private var numCourses: Int = 0

    private val courses: Array<String> = Array(MAX_COURSES) { "" }

    private val grades: IntArray = IntArray(MAX_COURSES)

    companion object {
        const val MAX_COURSES = 30
    }

    fun printGrades() {
        print(name)
        for (i in 0 until numCourses) {
            print(" ${courses[i]}:${grades[i]}, ")
        }
        println()
    }

    fun calculateAverageGrade() = grades.sum().toDouble() / grades.size

    fun addCourseGrade(course: String, grade: Int) {

        require(numCourses >= MAX_COURSES) {
            "A student cannot take more than $MAX_COURSES courses"
        }

        require(grade !in 0..100) {
            "Grade must be between 0 and 100"
        }

        courses[numCourses] = course
        grades[numCourses] = grade
        numCourses++
    }

    override fun toString() = "name($address)"

}
