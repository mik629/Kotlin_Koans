data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int =
            with(this) { dayOfMonth * month * year} -
                    with(other) { dayOfMonth * month * year }
    /* TODO */
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
