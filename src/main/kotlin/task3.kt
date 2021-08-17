fun main() {
    val itemLastOrder = 10100.0
    val itemOrder = 1_400.0
    var itemCount = 0.0
    val firstDiscount = 100.0
    val secondDiscount = 0.0095

    var total = itemOrder
    if (itemLastOrder <= 1_000 ) {
        total = itemOrder
        println("K oplate: $total rub")
        itemCount = itemCount + 1
    }
    if (itemLastOrder > 1_000 && itemLastOrder <= 10_000) {
        total = itemOrder - firstDiscount
        println("K oplate: $total rub")
        itemCount = itemCount + 1
    }
    if (itemLastOrder > 10_000) {
        total = itemOrder - itemOrder * secondDiscount
        println("K oplate: $total rub")
        itemCount = itemCount + 1
    }
}