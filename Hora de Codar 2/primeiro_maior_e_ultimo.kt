package HoraDeCodar2

fun main() {

    val numeros = IntArray(4)

    println("Digite 4 números um de cada vez:")

    for (i in 1..4) {
        println("número $i: ")
    numeros[i - 1] = readln().toInt()
    }

    val primeiro = numeros[0]
    val ultimo = numeros[3]
    val maior = numeros.max()

    println("Primeiro:$primeiro")
    println("Último:$ultimo")
    println("Maior:$maior")
}