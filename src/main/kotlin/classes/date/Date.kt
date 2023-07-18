package classes.date

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Date(day: Int, month: Int, year: Int) {

    var day: Int= MIN_DAY
        set(value) {
            require(value in MIN_DAY..MAX_DAY) { "The day must be between $MIN_DAY and $MAX_DAY." }
            field = value
        }

    var month: Int= MIN_MONTH
        set(value) {
            require(value in MIN_MONTH..MAX_MONTH) { "The month must be between $MIN_MONTH and $MAX_MONTH." }
            field = value
        }

    var year: Int= MIN_YEAR
        set(value) {
            require(value in MIN_YEAR..MAX_YEAR) { "The year must be between $MIN_YEAR and $MAX_YEAR." }
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
    companion object {
        private const val MAX_YEAR =9999
        private const val MAX_MONTH = 12
        private const val MAX_DAY = 31
        private const val MIN_YEAR = 1900
        private const val MIN_MONTH = 1
        private const val MIN_DAY = 1
    }
}