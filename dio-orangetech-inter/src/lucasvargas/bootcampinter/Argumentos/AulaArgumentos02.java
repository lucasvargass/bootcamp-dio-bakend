package lucasvargas.bootcampinter.Argumentos;

import java.util.Locale;
import java.util.Scanner;

public class AulaArgumentos02 {
    
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.printf("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.printf("Digite o seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.printf("Digite o sua idade: ");
        int idade = scanner.nextInt();

        System.out.printf("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Ola me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura e " + altura + " cm ");

    }
}
