## Ler o seguinte algorítimo:

 Início
	Ler x
	Ler y
z <- (x*y)+5
se z <= 0 então 
resposta<-’A’
senão
se z <= 100 então
resposta <- ‘B’
senão
resposta <-’C’
fim_se
fim_se
escrever z, resposta
fim
faça um teste de mesa e complete o quadro a seguir para os seguintes valores:

Variáveis
------------
x|y|z|Resposta
-|-|-|--------
3 |2|11|B|
150|3|455|C
7|-1|-2|A/B
-2|5|-5|A/B
50|3|155|C

# Teste
Este é um pequeno programa desenvolvido em Java através da IDE VsCode.

## Objetivo
O objetivo deste programa é calcular o valor de z a partir da entrada de dois números inteiros x e y. 
Em seguida, o programa imprime uma mensagem de acordo com o valor de z.

### Como Executar
Para executar o programa, você deve:

1. Clone o repositório em sua máquina local utilizando o seguinte comando no terminal:
```bash
# clonar repositório
git clone https://github.com/Cinthiacs/Teste.git
```
2. Abrir o arquivo teste.java em uma IDE ou editor de texto;
3. Compilar e executar o código.
4. Alternativamente, você também pode executar o programa a partir da linha de comando usando o comando javac para compilar e java para executar:
```bash
javac Valores.java
java Valores
```

### Funcionamento do Programa
* Ao ser executado, o programa solicita a entrada de dois números inteiros x e y. 
* Em seguida, o programa calcula o valor de z a partir da seguinte expressão: (x*y)+5.
* Depois, o programa imprime uma mensagem de acordo com o valor de z. Se z for menor ou igual a 0, o programa imprime "Resposta A". 
* Se z for maior que 0 e menor ou igual a 100, o programa imprime "Resposta B". 
* Caso contrário, o programa imprime "Resposta C".

### Tecnologias utilizadas
* Java 8
* IDE VsCode

### Autora
Cinthia Cavalheiro
