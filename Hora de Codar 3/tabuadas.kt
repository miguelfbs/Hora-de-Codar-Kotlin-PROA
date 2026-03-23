package HoraDeCodar3

fun main() {
    print("Digite um numero: ")
    val n = readln().toInt()

    for (i in 1..n) {
        println("\nTabuada do $i:")
        for (j in 1..10) {
            println("$i x $j = ${i * j}")
        }
    }
}