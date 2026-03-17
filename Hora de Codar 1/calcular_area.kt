fun main(){
println("Vamos calcular!")
    println("_________________________________________________")
    println("Vamos começar calculando a área de um retângulo.")
    println("Digite o valor da base do seu retângulo: ")
    var base_retangulo = readln().toFloat()
    println("Agora insira o valor da altura: ")
    var altura_retangulo = readln().toFloat()
    val area_retangulo = altura_retangulo * base_retangulo
    println("O valor da área é $area_retangulo m²")

    println("_________________________________________________")
    println("Agora vamos calcular a área de um quadrado.")
    println("Insira o valor do lado do quadrado: ")
    var lado_quadrado = readln().toFloat()
    val area_quadrado = lado_quadrado * lado_quadrado
    println("O valor da área do seu quadrado é $area_quadrado m²")

    println("Agora vamos calcular a área de um losângo.")
    println("Qual valor da diagonal maior? (apenas o número): ")
    var lado_maior_losango = readln().toFloat()
    println("Qual valor da diagonal menor? (apenas o número): ")
    var lado_menor_losango = readln().toFloat()
    val area_losango = (lado_menor_losango * lado_maior_losango)/2
    val resultado_losango = "%.2f".format(area_losango)
    println(resultado_losango)

    println("_________________________________________________")
    println("Agora vamos calcular a área de um trapézio.")
    println("Insira o valor da base maior do trapézio: ")
    var base_maior_trapezio = readln().toFloat()
    println("Insira o valor da base menor do trapézio: ")
    var base_menor_trapezio = readln().toFloat()
    println("Insira o valor da altura do trapézio: ")
    var altura_trapezio = readln().toFloat()
    val area_trapezio = ((base_maior_trapezio + base_menor_trapezio) * altura_trapezio) / 2
    val resultado_trapezio = "%.2f".format(area_trapezio)
    println("O valor da área do seu trapézio é $resultado_trapezio m²")

    println("_________________________________________________")
    println("Agora vamos calcular a área de um paralelogramo.")
    println("Insira o valor da base do paralelogramo: ")
    var base_paralelograma = readln().toFloat()
    println("Insira o valor da altura do paralelogramo: ")
    var altura_paralelograma = readln().toFloat()
    val area_paralelograma = base_paralelograma * altura_paralelograma
    val resultado_paralelograma = "%.2f".format(area_paralelograma)
    println("O valor da área do seu paralelogramo é $resultado_paralelograma m²")

    println("_________________________________________________")
    println("Agora vamos calcular a área de um triângulo.")
    println("Insira o valor da base do triângulo: ")
    var base_triangulo = readln().toFloat()
    println("Insira o valor da altura do triângulo: ")
    var altura_triangulo = readln().toFloat()
    val area_triangulo = (base_triangulo * altura_triangulo) / 2
    val resultado_triangulo = "%.2f".format(area_triangulo)
    println("O valor da área do seu triângulo é $resultado_triangulo m²")

    println("_________________________________________________")
    println("Agora vamos calcular a área de um círculo.")
    println("Insira o valor do raio do círculo: ")
    var raio_circulo = readln().toFloat()
    val area_circulo = Math.PI * raio_circulo * raio_circulo
    val resultado_circulo = "%.2f".format(area_circulo)
    println("O valor da área do seu círculo é $resultado_circulo m²")

}