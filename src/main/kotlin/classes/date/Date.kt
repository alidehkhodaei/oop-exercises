package classes.date

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Date(day: Int, month: Int, year: Int) {

    var day: Int=1
        set(value) {
            require(value in 1..31) { "The day must be between 1 and 31." }
            field = value
        }

    var month: Int=1
        set(value) {
            require(value in 1..12) { "The month must be between 1 and 12." }
            field = value
        }

    var year: Int=1900
        set(value) {
            require(value in 1900..9999) { "The year must be between 1900 and 9999." }
            field = value
        }

    init {
        setDate(day, month, year)
    }

    fun setDate(day: Int, month: Int, year: Int) {
        this.day = day
        this.month = month
        this.year = year
    }

    override fun toString(): String {
        val input = "$day/$month/$year"
        val inputFormat = DateTimeFormatter.ofPattern("d/M/yyyy")
        val outputFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        val date = LocalDate.parse(input, inputFormat)
        return date.format(outputFormat)
    }

}