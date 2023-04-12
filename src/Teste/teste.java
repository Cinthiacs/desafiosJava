package desafiosJava.src.Teste;
import java.util.Scanner;
import java.util.Locale;


public class teste {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int x = 0;
        int y = 0;
        int z = 0;

        System.out.println("Insira o valor inteiro de x: ");
        x = entrada.nextInt();

        System.out.println("Insira o valor inteiro de y: ");
        y = entrada.nextInt();

        z = (x*y)+5;
 
        if(z <= 0){
            System.out.println("Resposta A");
        } 
        if (z<=100){
            System.out.println("Resposta B");
        }else{
            System.out.println("Resposta C ");  
        }
        System.out.println("Valor de z: " + z);
      
    }
}