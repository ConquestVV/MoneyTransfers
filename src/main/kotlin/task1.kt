fun main() {
    val amount = 500000.0
    val commission = 0.0075
    val minValue = 3500.0

    var total = amount
    var totalCommission = amount * commission
    if (total > minValue){
        total = amount - totalCommission
    }


    println("Summa perevoda: $total kopeek")
    println("Kommissiya sostavila: $totalCommission kopeek")
}