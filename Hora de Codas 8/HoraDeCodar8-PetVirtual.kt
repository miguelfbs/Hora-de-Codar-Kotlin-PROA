class VirtualPet(val nome: String) {
    var nivelDeFome = 50
    var nivelFelicidade = 50
    var cansaco = 0
    var idade = 0
    var vontadeBanheiro = 0
    var sujeira = 0

    fun alimentar() {
        nivelDeFome -= 10
        if (nivelDeFome < 0) nivelDeFome = 0
        vontadeBanheiro += 15
        println("$nome foi alimentado. Nível de fome diminuiu.")
    }

    fun brincar() {
        nivelFelicidade += 10
        if (nivelFelicidade > 100) nivelFelicidade = 100
        cansaco += 20
        sujeira += 10
        println("$nome está brincando e se sentindo mais feliz!")
    }

    fun descansar() {
        println("Por quantas horas $nome vai descansar? (máximo 8h)")
        val horas = readln().toIntOrNull() ?: 0
        val horasValidas = horas.coerceIn(0, 8)
        val reducao = (horasValidas * 100) / 8
        cansaco -= reducao
        if (cansaco < 0) cansaco = 0
        println("$nome descansou $horasValidas hora(s). Cansaço reduziu em $reducao.")
    }

    fun levarAoBanheiro() {
        if (vontadeBanheiro == 0) {
            println("$nome não precisa ir ao banheiro agora.")
        } else {
            vontadeBanheiro = 0
            println("$nome foi ao banheiro e está aliviado! ")
        }
    }

    fun limpar() {
        if (sujeira == 0) {
            println("$nome já está limpinho, não precisa de banho agora.")
        } else {
            sujeira = 0
            println("$nome tomou banho e está cheiroso!")
        }
    }

    fun verificarStatus() {
        println("\n--------Status de $nome--------")
        println("Idade:               $idade")
        println("Fome:                $nivelDeFome / 100")
        println("Felicidade:          $nivelFelicidade / 100")
        println("Cansaço:             $cansaco / 100")
        println("Vontade de banheiro: $vontadeBanheiro / 100")
        println("Sujeira:             $sujeira / 100")
        println("------------------------------------\n")
    }

    fun passarTempo() {
        nivelDeFome += 3
        if (nivelDeFome > 100) nivelDeFome = 100
        nivelFelicidade -= 3
        if (nivelFelicidade < 0) nivelFelicidade = 0
        cansaco += 10
        if (cansaco > 100) cansaco = 100
        vontadeBanheiro += 5
        if (vontadeBanheiro > 100) vontadeBanheiro = 100
        idade++
    }

    fun verificarDerrota(): String? {
        if (nivelDeFome >= 100) return "$nome morreu de fome! Você perdeu."
        if (cansaco >= 100) return "$nome ficou exausto! Você perdeu."
        if (nivelFelicidade <= 0) return "$nome ficou triste demais! Você perdeu."
        if (vontadeBanheiro >= 100) return "$nome não aguentou segurar o xixi! Você perdeu."
        if (sujeira >= 100) return "$nome ficou sujo demais! Você perdeu."
        return null
    }
}

fun main() {
    println("Bem-vindo ao Simulador de Bichinho Virtual!")
    println("Digite o nome do seu bichinho:")
    val nomePet = readln().takeIf { it.isNotBlank() } ?: "Gabriel Augusto"
    val pet = VirtualPet(nomePet)

    while (true) {
        println("\nO que deseja fazer?")
        println("(1) Alimentar $nomePet")
        println("(2) Brincar com $nomePet")
        println("(3) $nomePet descansar")
        println("(4) Levar $nomePet ao banheiro")
        println("(5) Dar banho em $nomePet")
        println("(6) Verificar status de $nomePet")
        println("(7) Sair")

        val escolha = readln().toIntOrNull() ?: continue

        when (escolha) {
            1 -> pet.alimentar()
            2 -> pet.brincar()
            3 -> pet.descansar()
            4 -> pet.levarAoBanheiro()
            5 -> pet.limpar()
            6 -> pet.verificarStatus()
            7 -> {
                println("Saindo... Até a próxima!")
                return
            }
            else -> println("Opção inválida. Tente novamente.")
        }

        pet.passarTempo()

        if (pet.idade >= 50) {
            println("Parabéns! $nomePet chegou à idade 50! Você venceu!")
            return
        }

        val derrota = pet.verificarDerrota()
        if (derrota != null) {
            println(derrota)
            return
        }
    }
}
