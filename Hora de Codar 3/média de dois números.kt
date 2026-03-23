package HoraDeCodar3

fun main() {
    print("Digite o primeiro número: ")
    val n1 = readln().toInt()

    print("Digite um número menor: ")
    val n2 = readln().toInt()

    var soma = 0

    for (i in n1..n2) {
        soma += i
    }

    val quantidade = n2 - n1 + 1
    val media = soma.toDouble() / quantidade

    println("A média é: $media")
}