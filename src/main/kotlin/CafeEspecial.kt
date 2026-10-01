fun main() {
    println("BARISTA DE CAFÉ ESPECIAL")
    println("Prepare seu café seguindo a receita padrão!")
    println()

    var opcao = 0

    while (opcao != 3) {

        exibirMenu()

        print("Escolha uma opção: ")
        val entrada = readlnOrNull()?.toIntOrNull()

        if (entrada == null) {
            println("Opção inválida!")
            continue
        }

        opcao = entrada

        when (opcao) {
            1 -> prepararCafe()
            2 -> mostrarReceitaPadrao()
            3 -> println("Até a próxima!")
            else -> println("Opção inválida!")
        }

        println()
    }
}

fun exibirMenu() {
    println("MENU PRINCIPAL")
    println()
    println("1 - Preparar café")
    println("2 - Ver receita padrão")
    println("3 - Sair")
}

fun mostrarReceitaPadrao() {
    println()
    println("RECEITA PADRÃO")
    println("Café: 20g")
    println("Leite: 200ml")
    println("Temperatura: 65°C")
    println("Proporção: 10 ml de leite para cada 1 g de café")
}

fun prepararCafe() {
    println()
    println("Preparando seu café...")

    print("Digite o valor do pedido: R$ ")
    val valorPedido = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    if (valorPedido <= 0) {
        println("Valor do pedido inválido!")
        println("Por favor, tente novamente.")
        return
    }

    var tentativas = 3
    var receitaPerfeita = false

    while (tentativas > 0 && !receitaPerfeita) {

        print("Digite a quantidade de café em gramas: ")
        val entradaCafe = readlnOrNull()?.toDoubleOrNull() ?: 0.0
        if (entradaCafe <= 0) {
            println()
            println("Quantidade de café inválida!")
            println("Por favor, tente novamente.")
            continue
        }

        val cafe = entradaCafe

        print("Digite a quantidade de leite em ml: ")
        val entradaLeite = readlnOrNull()?.toDoubleOrNull() ?: 0.0
        if (entradaLeite <= 0) {
            println()
            println("Quantidade de leite inválida!")
            println("Por favor, tente novamente.")
            continue
        }

        val leite = entradaLeite

        print("Digite a temperatura do leite em °C: ")
        val entradaTemperatura = readlnOrNull()?.toDoubleOrNull() ?: 0.0
        if (entradaTemperatura <= 0) {
            println()
            println("Temperatura inválida!")
            println("Por favor, tente novamente.")
            continue
        }

        val temperatura = entradaTemperatura

        val proporcao = leite / cafe
        val proporcaoPerfeita = proporcao == 10.0

        println()
        println("Sua proporção é: $proporcao ml/g")

        val diferencaTemperatura = temperatura - 65

        println("Diferença da temperatura ideal: $diferencaTemperatura°C")
        println()

        var pontos = 0
        var percentualGorjeta = 0

        if (cafe < 18 || cafe > 22) {
            println("Quantidade de café inadequada!")
        } else {
            println("Quantidade de café adequada!")
            pontos++
        }

        if (leite >= 180 && leite <= 220) {
            println("Quantidade de leite adequada!")
            pontos++
        } else {
            println("Quantidade de leite inadequada!")
        }

        if (temperatura >= 60 && temperatura <= 70) {
            println("Temperatura adequada!")
            pontos++
        } else {
            println("Temperatura inadequada!")
        }

        println()

        when (pontos) {
            3 -> {
                if (proporcaoPerfeita) {
                    println("Receita perfeita!")
                    println("Gorjeta: 20%")
                    percentualGorjeta = 20
                    receitaPerfeita = true
                } else {
                    println("Receita boa, mas a proporção não está perfeita.")
                    println("Gorjeta: 10%")
                    percentualGorjeta = 10
                }
            }

            2 -> {
                println("Receita boa!")
                println("Gorjeta: 10%")
                percentualGorjeta = 10
            }

            1 -> {
                println("A receita precisa melhorar.")
                println("Gorjeta: 5%")
                percentualGorjeta = 5
            }

            0 -> {
                println("A receita está fora do padrão.")
                println("Gorjeta: 0%")
                percentualGorjeta = 0
            }
        }

        println()

        val valorGorjeta = valorPedido * percentualGorjeta / 100
        val valorTotal = valorPedido + valorGorjeta

        println("Valor da gorjeta: R$ $valorGorjeta")
        println("Valor total: R$ $valorTotal")

        println()

        tentativas--

        if (tentativas > 0 && !receitaPerfeita) {
            if (tentativas % 2 == 0) {
            println("Você está com um número par de tentativas restantes.")
            } else {
            println("Você está com um número ímpar de tentativas restantes.")
            }
        }
    }
}