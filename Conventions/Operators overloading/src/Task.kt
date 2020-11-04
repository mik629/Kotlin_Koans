import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR }

class MultiTimeInterval(val timeInterval: TimeInterval, val multiplier: Int)

operator fun TimeInterval.times(multiplier: Int) : MultiTimeInterval = MultiTimeInterval(this, multiplier)

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = addTimeIntervals(timeInterval, 1)

operator fun MyDate.plus(multiTimeInterval: MultiTimeInterval): MyDate =
        with(multiTimeInterval) { addTimeIntervals(timeInterval, multiplier) }

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
