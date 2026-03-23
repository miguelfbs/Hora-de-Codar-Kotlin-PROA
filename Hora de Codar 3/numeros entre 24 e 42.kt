package HoraDeCodar3

fun main() {
    var dentro = 0
    var fora = 0

    println("Digite 10 números, um de cada vez.")
    for (i in 1..10) {
        print("Digite o valor $i: ")
        val numero = readln().toInt()

        if (numero >= 24 && numero <= 42) {
            dentro++
        } else {
            fora++
        }
    }

    println("\nValores entre 24 e 42: $dentro")
    println("Valores fora deste intervalo: $fora")
}