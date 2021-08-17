fun main() {
    val likes = 61

    var cost = (likes - 1) / 10
    var message = "Naravitsya $likes ludyam"
    if (likes === cost * 10 + 1) {
        message = "Nravitsya $likes cheloveku"
    }
    println(message)
}