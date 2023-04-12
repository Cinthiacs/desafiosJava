package desafiosJava.src.Contabilista;
import java.util.Scanner;
import java.util.Locale;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Contabilista {
    public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    Scanner entrada = new Scanner(System.in);

    int imposto = 0;
    String nome;

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    System.out.println(dtf.format(LocalDateTime.now()));

    System.out.println("Olá caro usuário! Digite seu nome: ");
    nome = entrada.nextLine();

    System.out.println(nome + " Para o valor do imposto digite: ");
    System.out.println(" 1 para valor menor que 10.000");
    System.out.println(" 2 para valor maior que 10.001 até 40.000");
    System.out.println(" 3 para valor maior que 40.001");
    imposto = entrada.nextInt();
    
    while (imposto < 1 || imposto > 3){
        System.out.println(" 1 para valor menor que 10.000");
        System.out.println(" 2 para valor maior que 10.001 até 40.000");
        System.out.println(" 3 para valor maior que 40.001");
        imposto = entrada.nextInt();
    }
    
    switch (imposto) {
        case 1:
        System.out.println(nome + " Imposto deverá ser pago no dia 10° do mês");
            break;
        case 2:
        System.out.println(nome + " Imposto deverá ser pago no dia 12° do mês");
            break;

        case 3:
        System.out.println(nome + " Imposto deverá ser pago no dia 15° do mês");
            break;
        default:

            break;
    }
    System.out.print ("Pressione qualquer tecla para terminar o programa ");
    System.in.read ();
}

}
