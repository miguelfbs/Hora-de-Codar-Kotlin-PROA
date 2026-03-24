import kotlin.system.exitProcess


var saldo = 100.5f
var nomeUsuario = ""
val senha = "3589"

val extrato = mutableListOf(
    "Compra no Supermercado Extra    - R$ 45,00",
    "Depósito via PIX              + R$ 200,00",
    "Compra na Farmácia Drogasil    - R$ 32,50",
    "Compra na Loja Americanas      - R$ 78,90\n"
)

fun main() {
    print("Bem-vindo! Por favor, informe seu nome: ")
    nomeUsuario = readln()
    println("Olá $nomeUsuario, é um prazer ter você por aqui!")
    menu()
}

fun menu() {
    println("1 - Ver Saldo")
    println("2 - Ver Extrato")
    println("3 - Fazer Saque")
    println("4 - Fazer Depósito")
    println("5 - Fazer Transferência")
    println("6 - Sair")
    print("Escolha uma opção: ")
    inicio()
}

fun inicio() {
    val escolha = readLine()?.toIntOrNull()

    when (escolha) {
        1 -> verSaldo()
        2 -> verExtrato()
        3 -> fazerSaque()
        4 -> fazerDeposito()
        5 -> fazerTransferencia()
        6 -> sair()
        else -> erro()
    }
}

fun validarSenha(): Boolean {
    print("Informe sua senha: ")
    val senhaInformada = readln().orEmpty()
    return if (senhaInformada == senha) {
        true
    } else {
        println("Senha incorreta. Tente novamente.")
        false
    }
}

fun verSaldo() {
    if (!validarSenha()) {
        verSaldo()
        return
    }
    println("\nSeu saldo atual é: R$ ${"%.2f".format(saldo)}")
    println()
    menu()
}

fun verExtrato() {
    if (!validarSenha()) {
        verExtrato()
        return
    }
    println("=== EXTRATO ===")
    extrato.forEach { println(it) }
    println("Saldo atual: R$ ${"%.2f".format(saldo)}")
    println()
    menu()
}

fun fazerDeposito() {
    print("Qual o valor para depósito? R$ ")
    val deposito = readln().toFloatOrNull()

    when {
        deposito == null -> {
            println("Por favor, informe um número válido.")
            fazerDeposito()
        }
        deposito <= 0 -> {
            println("Operação não autorizada.")
            menu()
        }
        else -> {
            saldo += deposito
            extrato.add("Depósito realizado              + R$ ${"%.2f".format(deposito)}")
            println("Depósito de R$ ${"%.2f".format(deposito)} realizado com sucesso!")
            println()
            menu()
        }
    }
}

fun fazerSaque() {
    if (!validarSenha()) {
        fazerSaque()
        return
    }

    print("Qual o valor para saque? R$ ")
    val saque = readLine()?.toFloatOrNull()

    when {
        saque == null -> {
            println("Por favor, informe um número válido.")
            fazerSaque()
        }
        saque <= 0 -> {
            println("Operação não autorizada.")
            menu()
        }
        saque > saldo -> {
            println("Operação não autorizada.")
            menu()
        }
        else -> {
            saldo -= saque
            extrato.add("Saque realizado                - R$ ${"%.2f".format(saque)}")
            println("Saque de R$ ${"%.2f".format(saque)} realizado com sucesso!")
            println()
            menu()
        }
    }
}

fun fazerTransferencia() {
    if (!validarSenha()) {
        fazerTransferencia()
        return
    }

    print("Informe o número da conta destino: ")
    val conta = readLine()?.toIntOrNull()

    if (conta == null) {
        println("Por favor, informe apenas números para o número da conta.")
        fazerTransferencia()
        return
    }

    print("Qual o valor para transferência? R$ ")
    val transferencia = readLine()?.toFloatOrNull()

    when {
        transferencia == null -> {
            println("Por favor, informe um número válido.")
            fazerTransferencia()
        }
        transferencia <= 0 -> {
            println("Operação não autorizada.")
            menu()
        }
        transferencia > saldo -> {
            println("Operação não autorizada.")
            menu()
        }
        else -> {
            saldo -= transferencia
            extrato.add("Transferência p/ conta $conta  - R$ ${"%.2f".format(transferencia)}")
            println("Transferência de R$ ${"%.2f".format(transferencia)} para a conta $conta realizada com sucesso!")
            println()
            menu()
        }
    }
}

fun erro() {
    println("Por favor, informe um número entre 1 a 6.")
    menu()
}

fun sair() {
    print("Você deseja sair? (S/N) ")
    val confirma = readln().orEmpty().uppercase()

    when (confirma) {
        "S" -> {
            println("$nomeUsuario, foi um prazer ter você por aqui!")
            exitProcess(0)
        }
        "N" -> menu()
        else -> sair()
    }
}
