## Desafio Contabilista:

Um contabilista precisa conferir impostos de renda que ele fez, e tem para isso 250 impostos para fazer esta conferência. Lembrando que cada imposto tem um valor a ser pago, ele decidiu fazer uma separação de cada imposto por faixa, ou seja, para que pudesse separar as datas do melhor pagamento e assim ele fez segundo as regras a seguir:

1- Os impostos menores de R$ 10 mil são pagos no dia 10 do mês.

2- Os impostos entre R$ 10.001,00 (Dez mil e 1) e R$ 40 mil são pagos no dia 12 do mês.

3- Os impostos acima de R$ 40.001,00 (Quarenta mil e um) são pagos no dia 15 do mês.

Este contabilista precisa de um algorítimo que faça a separação destes impostos e que aponte ao final, quantos ele precisa pagar nos dias 10,12 e 15 do mês. Os elementos principais a serem utilizados/criados neste algoritmos são:

1-Variáveis

2- Vetores/Matrizes

3- Contadores

4- Malhas de Repetição

Neste caso monte um algoritmo que vá fazer isso da melhor forma possível.

Lembrando que algoritmo é um português estruturado para programação e então não deve ter palavras em inglês ou nada que se refira a linguagem de programação.

# Contabilista
Este é um projeto desenvolvido em Java através da IDE VsCode que calcula o prazo para o pagamento de impostos baseado no valor informado pelo usuário.

## Como Executar
1. Clone o repositório em sua máquina local utilizando o seguinte comando no terminal:
```bash
# clonar repositório
git clone https://github.com/Cinthiacs/desafiosJava.git
```
2. Abra o projeto em sua IDE de preferência
3. Rode o arquivo Contabilista.java presente no diretório src através da opção "Run" da sua IDE.
4. Alternativamente, você também pode executar o programa a partir da linha de comando usando o comando javac para compilar e java para executar:
```bash
javac Contabilista.java
java Contabilista
```

### Funcionalidades

Ao rodar o programa, o usuário deverá informar o seu nome e o valor do imposto a ser pago. 
O sistema irá então calcular e exibir a data de vencimento do imposto baseado no valor informado.

Para valores menores ou iguais a R$ 10.000,00, o imposto deverá ser pago no dia 10° do mês. 
Para valores entre R$ 10.001,00 e R$ 40.000,00, o imposto deverá ser pago no dia 12° do mês. 
Já para valores acima de R$ 40.001,00, o imposto deverá ser pago no dia 15° do mês.

Tecnologias utilizadas
* Java 8
* IDE VsCode

### Autora
Cinthia Cavalheiro.
