package classes.time

class Time(hour: Int, minute: Int, second: Int) {

    var hour: Int = MIN_HOURS
        set(value) {
            require(value in MIN_HOURS..MAX_HOURS) { "The hour must be between $MIN_HOURS and $MAX_HOURS." }
            field = value
        }

    var minute: Int = MIN_MINUTES
        set(value) {
            require(value in MIN_MINUTES..MAX_MINUTES) { "The minute must be between $MIN_MINUTES and $MAX_MINUTES." }
            field = value
        }

    var second: Int = MIN_SECONDS
        set(value) {
            require(value in MIN_SECONDS..MAX_SECONDS) { "The second must be between $MIN_SECONDS and $MAX_SECONDS." }
            field = value
        }

    init {
        setTime(hour, minute, second)
    }

    fun setTime(hour: Int, minute: Int, second: Int) {
        this.hour = hour
        this.minute = minute
        this.second = second
    }

    fun nextSecond(): Time {
        if (second == MAX_SECONDS) {
            second = MIN_SECONDS
            minute = MIN_MINUTES
            if (hour == MAX_HOURS) {
                hour = MIN_HOURS
            } else {
                hour++
            }
        } else {
            second++
        }
        return this
    }

    fun previousSecond(): Time {
        if (second == MIN_SECONDS) {
            second = MAX_SECONDS
            if (minute == MIN_MINUTES) {
                minute = MAX_MINUTES
                if (hour == MIN_HOURS) {
                    hour = MAX_HOURS
                } else {
                    hour--
                }
            } else {
                minute--
            }
        } else {
            second--
        }
        return this
    }

    override fun toString(): String {
        return String.format("%02d:%02d:%02d", hour, minute, second)
    }

    companion object {
        private const val MAX_HOURS = 23
        private const val MAX_MINUTES = 59
        private const val MAX_SECONDS = 59
        private const val MIN_HOURS = 0
        private const val MIN_MINUTES = 0
        private const val MIN_SECONDS = 0
    }

}