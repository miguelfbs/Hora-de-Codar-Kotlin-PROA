package HoraDeCodar2

fun main(){

    val numeros = DoubleArray(6)
    println("Digite 6 números:")

    for (i in 1..6) {
        print("Número $i: ")
        numeros[i - 1] = readln().toInt().toDouble()
    }
    val soma = numeros.sum()
    val media = soma/6

    println("Os números são: ${numeros.joinToString(", ")}")
    println ("A média desses números é: ${"%.2f".format(media)}")

}