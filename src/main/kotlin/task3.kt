fun main() {
    val itemLastOrder = 10100.0
    val itemOrder = 1_400.0
    var itemCount = 0.0
    val firstDiscount = 100.0
    val secondDiscount = 0.0095
    val meloman = true
    val melomanDiscount = 0.0099

    var total = itemOrder
    if (itemLastOrder <= 1_000 ) {
        total = itemOrder
    } else
    if (itemLastOrder > 1_000 && itemLastOrder <= 10_000) {
        total = itemOrder - firstDiscount
    } else
    if (itemLastOrder > 10_000) {
        total = itemOrder - itemOrder * secondDiscount
    }

    if (meloman === true) {
        total = total - total * melomanDiscount
    }

    println("K oplate: $total rub")
}