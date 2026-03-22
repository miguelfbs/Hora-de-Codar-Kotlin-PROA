package HoraDeCodar2

fun main(){

    println("Escreva um número: ")
    var n1 = readLine()!!.toInt()

    if (n1 < 0){
        println("Este número é negativo!")
    }
    if(n1 > 0){
        println("Esse número é positivo!")
    }
    if(n1 == 0){
        println("Esse número é 0")
    }
}