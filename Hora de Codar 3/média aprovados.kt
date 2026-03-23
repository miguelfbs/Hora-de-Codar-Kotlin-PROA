package HoraDeCodar3

fun main() {
    var aprovados = 0
    var medias = false

    println ("Vamos calcular a média dos alunos.")

    while (!medias) {
        print("Digite a primeira nota: ")
        val nota1 = readln().toDouble()

        print("Digite a segunda nota: ")
        val nota2 = readln().toDouble()

        val media = (nota1 + nota2) / 2

        println("Média: $media")

        if (media >= 9.5) {
            aprovados++
        }

        print("Quer calcular a média de outro aluno?\n(S)Sim\n(N)Não\nDigite sua resposta: ")
        val resposta = readln().uppercase()

        if (resposta == "N" || resposta == "não" || resposta == "nao") {
            medias = true
        }
    }

    println("Quantidade de alunos aprovados: $aprovados")
}