package HoraDeCodar3

fun main() {
    println("Vamos fazer uma divisão!")
    println("Digite o primeiro número: ")
    val n1 = readln().toDouble()

    var n2: Double
    do {
        print("Digite o segundo número (deve ser maior que 0): ")
        n2 = readln().toDouble()
        if (n2 <= 0) {
            println("Valor inválido! O segundo número não pode ser zero ou negativo.")
        }
    } while (n2 <= 0)

    println("\nResultado: ${n1 / n2}")
}
