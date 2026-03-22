package HoraDeCodar2

    var n4 = 0

fun main(){

    println("Escreva um número: ")
    var n1 = readln().toInt()

    println("Escreva outro número: ")
    var n2 = readln().toInt()

    println("Por fim, escreva mais um número: ")
    var n3 = readln().toInt()

    if(n1 < n2 && n1 < n3){
        n4 = n2 + n3
    }
    if (n2 < n3 && n2 < n1){
        n4 = n1 + n3
    }
    if (n3 < n1 && n3 < n2){
        n4 = n1 + n2
    }
    println("A soma dos dois maiore números é: $n4 ")
}