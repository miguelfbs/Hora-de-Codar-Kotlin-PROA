package HoraDeCodar2

fun main() {
    val numeros = IntArray(6)

    println("Digite 6 números um de cada vez:")

    for (i in 1..6) {
        print("valor $i: ")
        numeros[i - 1] = readln().toInt()
    }

    val soma = numeros.filter { it < 72 }.sum()
    println("Números informados foram: ${numeros.joinToString(", ")}")
    println("A soma dos números menores que 72 é: $soma")
}
