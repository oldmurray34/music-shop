import java.math.BigDecimal

fun main() {
    var amount: Int = 443325
    var result: Double = 0.0
    var firstTierBorder: Int = 1000
    var secondTierBorder: Int = 10_000
    var firstTierDiscount: Int = 100
    var secondTierDiscount: Double = amount * 0.05
    var regularDiscount: Double = result * 0.01
    val isRegular: Boolean = true

    if (amount in 1..firstTierBorder) {
        result = amount.toDouble()
    } else if (amount in (firstTierBorder + 1) until secondTierBorder) {
        result = (amount - firstTierDiscount).toDouble()
    } else if (amount > secondTierBorder) {
        result = amount - secondTierDiscount
    }

    println("Покупка - $amount руб.")
    if (isRegular) {
        result -= regularDiscount
    }
    println("Итоговая сумма: ${BigDecimal(result).setScale(2)} руб.")
}