fun renderProductTable(): String {
    return html {
        table {
            tr(color = getTitleColor()) {
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()
            for (p in products.withIndex()) {
                tr {
                    td(color = getCellColor(0, p.index), init = { text(p.value.description) })
                    td(color = getCellColor(1, p.index), init = { text(p.value.price) })
                    td(color = getCellColor(2, p.index), init = { text(p.value.popularity) })
                }
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, row: Int) = if ((index + row) % 2 == 0) "#dce4ff" else "#eff2ff"
