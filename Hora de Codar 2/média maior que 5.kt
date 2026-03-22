package HoraDeCodar2

fun main() {

    val numeros = DoubleArray(4)

    println("Digite 4 números (entre 1 e 9) um de cad vez:")

    for (i in 1..4) {
        var valor: Double
        do {
            print("Número $i: ")
            valor = readln().toDouble()
            if (valor <= 0 || valor >= 10) {
                println("Os numeros devem ser entre 0 e 10.")
            }
        } while (valor <= 0 || valor >= 10)
        numeros[i - 1] = valor
    }

    val media = numeros.sum() / 4

    println("A média é: ${"%.2f".format(media)}")

    if (media > 5) {
        println("Você passou no teste!")
    }
    else {
        println("Tente novamente.")
    }
}
