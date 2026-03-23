package HoraDeCodar4

fun main() {
    val planetas = arrayOf("Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno")

    print("Digite o nome de um planeta: ")
    val planeta = readln()

    if (planetas.any { it.uppercase() == planeta.uppercase() }) {
        println("$planeta está na lista de planetas!")
    } else {
        println("$planeta não está na lista de planetas.")
    }
}