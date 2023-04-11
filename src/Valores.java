import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*Escreva um algoritmo para ler 2 valores e se o segundo valor informado for ZERO, 
deve ser lido um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero 
e imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido. 
(utilizar a estrutura REPITA).*/

public class Valores {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Scanner entrada = new Scanner(System.in);

        float valor1 = 0;
        float valor2 = 0;
        String nome;
        float div = 0;

        

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()));
       
        System.out.println("Olá, caro Usuário! Digite seu nome Abaixo: ");
        nome = entrada.nextLine();

        System.out.println (nome + " Digite um numero inteiro:");
        valor1 = entrada.nextFloat();

        System.out.println(nome + " Digite outro número inteiro que nao seja 0");
        valor2 = entrada.nextFloat();

        while(valor2 == 0){
            System.out.println(nome + " Digite outro número que nao seja 0");
            valor2 = entrada.nextFloat();
        }
        
        div = valor1/valor2;

        System.out.printf("A razao entre " + valor1 + " e " + valor2 + " =  %.2f\r\n", div);
        System.out.print ("Pressione qualquer tecla para terminar o programa ");
        System.in.read ();
    }
}
