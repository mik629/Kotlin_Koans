import java.util.HashMap

/* TODO */

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}

fun buildMap(build: HashMap<Int, String>.() -> Unit): HashMap<Int, String> {
    val hashMap = HashMap<Int, String>()
    hashMap.build()
    return hashMap
}
