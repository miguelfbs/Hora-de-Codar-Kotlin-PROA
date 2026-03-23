package HoraDeCodar4

fun main() {
    val frutas = mutableListOf("Maçã", "Banana", "Uva", "Laranja", "Morango", "Abacaxi")

    while (frutas.isNotEmpty()) {
        println("\nFrutas disponíveis:")
        for (fruta in frutas) {
            println("- $fruta")
        }

        print("\nDigite uma fruta para remover: ")
        val fruta = readln()

        val encontrada = frutas.find { it.uppercase() == fruta.uppercase() }

        if (encontrada != null) {
            frutas.remove(encontrada)
            println("$encontrada foi retirada da lista.")
        } else {
            println("Fruta indisponível no nosso mercado.")
        }
    }

    println("\nLista de compras finalizada!")
}
