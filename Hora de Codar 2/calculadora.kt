package HoraDeCodar2

fun main() {
    println("Vamos Calcular!")
    println("Digite o primeiro número: ")
    val n1 = readln().toInt()

    println("Digite o segundo número: ")
    val n2 = readln().toInt()

    println("\nEscolha a operação:")
    println("(1) Adição")
    println("(2) Subtração")
    println("(3) Divisão")
    println("(4) Multiplicação")
    print("Digite: ")
    val operacao = readln().toInt()

    if (operacao == 1) {
        println("\nResultado: ${n1 + n2}")
    }
    if (operacao == 2) {
        println("\nResultado: ${n1 - n2}")
    }
    if (operacao == 3) {
        println("\nResultado: ${n1 / n2}")
    }
    if (operacao == 4) {
        println("\nResultado: ${n1 * n2}")
    }
}