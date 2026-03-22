package HoraDeCodar2

fun main(){
    println("Escreva um número: ")
    var n1 = readln().toInt()

    println("Escreva outro número: ")
    var n2 = readln().toInt()

    println("Por fim, escreva mais um número: ")
    var n3 = readln().toInt()

    if(n1 > n2 && n1 > n3){
        println("O número $n1 é o maior dentre todos.")
    }
    if(n2 > n1 && n2 > n3){
        println("O número $n2 é o maior dentre todos.")
    }
    if(n3 > n1 && n3 > n2){
        println("O número $n3 é o maior dentre todos.")
    }
}