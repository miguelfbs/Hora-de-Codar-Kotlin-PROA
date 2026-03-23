package HoraDeCodar3

fun main() {

    var soma = 0

    for (i in 15..100) {
        soma += i
    }

    val media = soma.toDouble() / (100 - 15 + 1)

    println("A média é $media")
}