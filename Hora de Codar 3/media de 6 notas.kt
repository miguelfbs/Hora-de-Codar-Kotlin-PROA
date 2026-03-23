package HoraDeCodar3

fun main() {
    var soma = 0.0

    println("Vamos calcular sua média!")

    for (i in 1..6) {
        var nota: Double
        do {
            print("Digite a nota $i (0 a 10): ")
            nota = readln().toDouble()
            if (nota < 0 || nota > 10) {
                println("Nota inválida! Digite uma nota entre 0 e 10.")
            }
        } while (nota < 0 || nota > 10)
        soma += nota
    }

    val media = soma / 6

    println("A média é: ${"%.2f".format(media)}")
}