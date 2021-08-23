fun main() {
    val likes = 81

    var cost = likes%10
    var message = "Naravitsya $likes ludyam"
    if (cost === 1) {
        message = "Nravitsya $likes cheloveku"
    }
    println(message)
}