class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
    private var next = start

    override fun iterator(): Iterator<MyDate> =
            object : Iterator<MyDate> {
                override fun next(): MyDate {
                    val current = next
                    next = next.followingDate()
                    return current
                }

                override fun hasNext(): Boolean = next <= end
            }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}