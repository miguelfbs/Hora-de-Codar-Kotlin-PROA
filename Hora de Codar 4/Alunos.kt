package HoraDeCodar4

fun main() {
    val estudantes = mutableListOf<String>()

    println("Digite o nome do estudante que deseja cadastrar ou PARE para encerrar:")

    while (true) {
        print("\nNome: ")
        val nome = readln()

        if (nome.uppercase() == "PARE") {
            break
        }

        estudantes.add(nome)
        println("Estudante cadastrado!")
    }

    println("\nLista de Estudantes")
    println("Total cadastrado: ${estudantes.size}")

    for (i in 0 until estudantes.size) {
        println("${i + 1}. ${estudantes[i]}")

    }
}