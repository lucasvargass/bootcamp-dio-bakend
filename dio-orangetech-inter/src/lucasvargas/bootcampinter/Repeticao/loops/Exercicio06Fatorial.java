package lucasvargas.bootcampinter.Repeticao.loops;

import java.util.Scanner;

public class Exercicio06Fatorial {
    
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        
        /*
        Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
        Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
        */

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite o Fatorial: ");
        int fatorial = scanner.nextInt();

        int multiplicacao = 1;

        for (int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;
        }
        
        System.out.println(fatorial + "! " + " = " + multiplicacao);


    }
}
