package HoraDeCodar2

fun main(){

    println("Escreva um número: ")
    var n1 = readLine()!!.toInt()

    println("Escreva outro número: ")
    var n2 = readLine()!!.toInt()

    if (n1 < n2){
        println("O número $n2 é o maior.")
    }else{
        println("O número $n1 é o maior.")
    }
}