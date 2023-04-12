package desafiosJava.src.Bolsa_estudante;
import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Bolsa_estudante {
    public static void main(String[] args) throws Exception {

      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
      Random random = new Random();

      String[] nomes = new String[1200];
      int nota = 0;
      float mensalidade = 650;
      double desc90 = 0.9;
      double desc65 = 0.65;
      double desc45 = 0.45;
      double desc20 = 0.20;

      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
      System.out.println(dtf.format(LocalDateTime.now()));

      System.out.println("Olá! Bem vindo(a) à escola Técnica ACME Estudos Online!");

      System.out.println("Digite seu nome: ");
      String nome = scanner.nextLine();
      int posicao = random.nextInt(nomes.length);
      nomes[posicao] = nome;

      System.out.println("Digite a pontuaçao da prova abaixo: ");

      nota = scanner.nextInt();
      
      if(nota >= 45 && nota <= 50){
        System.out.println(nome + " Parabéns você conseguiu 90% de desconto na mensalidade!");
        System.out.println("Numero da Inscriçao: ** " + posicao + " **");
        System.out.printf("Sua mensalidade ficará em: %.1f R$",((mensalidade)-(mensalidade*desc90)));
      }
      
      if(nota >= 35 && nota <= 44){
        System.out.println(nome + " Você conseguiu 65% de desconto na mensalidade");
        System.out.println("Numero da Inscriçao: ** " + posicao + " **");
        System.out.printf("Sua mensalidade ficará em: %.1f R$",((mensalidade)-(mensalidade*desc65)));

      }
      if (nota >= 25 && nota <= 34){
        System.out.println(nome + " Você conseguiu 45% de desconto na mensalidade");
        System.out.println("Numero da Inscriçao: ** " + posicao + " **");
        System.out.printf("Sua mensalidade ficará em: %.1f R$",((mensalidade)-(mensalidade*desc45)));

      }
      if (nota <= 24){
        System.out.println(nome + " Você conseguiu 20% de desconto na mensalidade");
        System.out.println("Numero da Inscriçao: ** " + posicao + " **");
        System.out.printf("Sua mensalidade ficará em: %.1f R$",((mensalidade)-(mensalidade*desc20)));
      }
      System.out.print ("\r Pressione qualquer tecla para terminar o programa ");
      System.in.read ();
   }
}