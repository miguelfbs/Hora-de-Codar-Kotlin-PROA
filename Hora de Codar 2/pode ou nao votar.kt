package HoraDeCodar2

fun main() {
    val anoAtual = 2026
    var anoNascimento = 0
    do {
        print("Digite seu ano de nascimento: ")
        anoNascimento = readln().toInt()
        if (anoNascimento < 1900) {
            println("Ano inválido! Digite novamente!")
        }
    } while (anoNascimento < 1900)

    val idade = anoAtual - anoNascimento

    println("Você tem $idade anos")

    if (idade >= 16) {
        println("Você PODE votar este ano!")
    } else {
        println("Você NÃO PODE votar este ano.")
    }
}