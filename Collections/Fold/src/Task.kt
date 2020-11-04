// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> =
        customers.fold(
                customers.first().getOrderedProducts().toSet()
        ) { res, element -> element.getOrderedProducts().intersect(res) }

fun Customer.getOrderedProducts(): List<Product> =
        orders.flatMap(Order::products)