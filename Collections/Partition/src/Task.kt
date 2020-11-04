// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> =
        customers.partition {
            it.orders.count { order -> order.isDelivered } <
                    it.orders.count { order -> !order.isDelivered }
        }.first.toSet()
