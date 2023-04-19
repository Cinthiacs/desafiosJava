import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Banco {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Scanner entrada = new Scanner(System.in);
        
        String nome;
        int contaNum = 0;
        float saldo = 500;
        float debito = 0;
        float credito = 0;
        float saldoAtual = 0;
        int condicao = 0;
        boolean sair_bool = true;

    
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()));
       
        System.out.println("Olá, caro Usuário! Digite seu nome Abaixo: ");
        nome = entrada.nextLine();
        
        System.out.println(nome + " Digite o número da sua conta com 6 digitos: ");
        contaNum = entrada.nextInt();
        
        while(String.valueOf(contaNum).length()!=6){
            System.out.println(nome + " Digite o número da sua conta com 6 dígitos: ");
            contaNum = entrada.nextInt();
        }
       
        System.out.printf(nome + " Conta número: " + contaNum + " Seu Saldo Autal é: %.2f\r\n",saldo);
        
        System.out.println(nome + " Gostaria de creditar em sua conta algum valor em sua conta?");
        System.out.println("Digite 1 para creditar e 2 para continuar");
        condicao = entrada.nextInt();

        while(condicao < 1 || condicao > 2){
            System.out.println("Digite 1 para creditar e 2 para continuar");
            condicao = entrada.nextInt();
        }

        switch (condicao) {
            case 1:
            System.out.println("Digite o valor a ser creditado: ");
            credito = entrada.nextFloat();
               break;
        
            case 2:

                break;
        }
       

        System.out.println(nome + " Digite o valor do débito: ");
        debito = entrada.nextFloat();
        
        System.out.printf(nome + " Seu saldo anterior era de ",(saldo+credito));
        

        saldoAtual = (saldo - debito + credito);

        if(saldoAtual >= 0){
            System.out.printf(nome + " Seu saldo atual é de: %.2f \r\n", saldoAtual);
            System.out.println("Saldo POSITIVO");
        }else{
            System.out.printf(nome + " Seu saldo atual é de: %.2f \r\n", saldoAtual);
            System.out.println("Saldo NEGATIVO");
        }

    System.out.print ("Pressione qualquer tecla para terminar o programa ");
    System.in.read ();
    }
    
}
