fun main() {
    val amount = 5000.0
    val commission = 0.0075
    val minValue = 35.0

    var total = amount
    if (total > minValue){
        total = amount - amount * commission
    }

    println(total)
}