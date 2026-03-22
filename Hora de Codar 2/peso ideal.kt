package HoraDeCodar2

fun main() {
    print("Digite sua altura (ex: 1.75): ")
    val altura = readln().toDouble()

    println("Gênero:\n(1) Feminino\n(2) Masculino")
    print("Digite seu gênero: ")
    val genero = readln().toInt()

    if (genero == 1) {
        val pesoIdeal = (62.1 * altura) - 44.7
        println("Seu peso ideal é: ${"%.2f".format(pesoIdeal)} kg")
    }
    if (genero == 2) {
        val pesoIdeal = (72.7 * altura) - 58
        println("Seu peso ideal é: ${"%.2f".format(pesoIdeal)} kg")
    }
    else {
        println("Gênero inválido! Digite novamente.")
    }
}