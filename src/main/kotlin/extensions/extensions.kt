package extensions

fun Float.isPositive() = this > 0

fun Double.isPositive() = this > 0
fun Double.isPositiveOrZero() = this >= 0

fun Int.isPositive() = this > 0

fun Int.isPositiveOrZero() = this >= 0

fun Int.isNegative() = this < 0