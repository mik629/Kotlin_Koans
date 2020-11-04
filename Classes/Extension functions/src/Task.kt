fun Int.r(): RationalNumber = RationalNumber(this, 1)

fun Pair<Int, Int>.r(): RationalNumber = with(this) { RationalNumber(first, second) }

data class RationalNumber(val numerator: Int, val denominator: Int)
