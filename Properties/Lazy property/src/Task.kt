class LazyProperty(val initializer: () -> Int) {
    /* TODO */

    var initLazy: Any? = null

    val lazy: Int
        get() {
            if (initLazy == null) {
                initLazy = initializer.invoke()
            }
            return initLazy as Int
        }
}
