# Barista de Café Especial

Sistema interativo via terminal desenvolvido em Kotlin para simulação do preparo de cafés especiais e cálculo de gorjetas com base no alinhamento da receita padrão.

---

## Descrição do Estudo de Caso

O programa simula a rotina de um Barista de Café Especial. O objetivo do usuário é preparar o café ajustando a quantidade de café (g), leite (ml) e a temperatura (°C). 

Com base nas proporções informadas:
- O sistema valida as quantidades inseridas utilizando Null Safety em todas as entradas.
- Pontua a precisão da receita (café ideal entre 18g e 22g, leite entre 180ml e 220ml e temperatura entre 60°C e 70°C).
- Calcula o percentual de gorjeta conforme a pontuação alcançada e exibe o valor total da conta.
- Permite até 3 tentativas por pedido até atingir a receita perfeita.

---

## Tecnologias e Conceitos Aplicados

- Linguagem: Kotlin
- Entrada e Saída: println() e readlnOrNull()
- Null Safety: Safe Calls (?.), Operador Elvis (?:) e conversões com tratamento nulo (toIntOrNull(), toDoubleOrNull())
- Estruturas de Condição: if/else e when
- Laços de Repetição: while
- Funções: Modularização com exibirMenu(), mostrarReceitaPadrao() e prepararCafe()

---

## Como Rodar o Programa

### Pré-requisitos
- Java JDK (versão 11 ou superior)
- Kotlin Compiler ou IntelliJ IDEA instalado

### Passo a Passo

1. Clonar o repositório:
   ```bash
   git clone [https://github.com/barbaramaker/barista-cafe-especial.git](https://github.com/barbaramaker/barista-cafe-especial.git)
