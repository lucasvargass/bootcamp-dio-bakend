package lucasvargas.bootcampinter.Repeticao.loops;

import java.util.Scanner;

public class Exercicio02Nota {
    
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        
        /*
        Faça um programa que peça uma nota, entre zero e dez.
        Mostre uma mensagem caso o valor seja inválido
        e continue pedindo
        até que o usuário informe um valor válido.
        */

        int nota;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite a sua nota: ");
        nota = scanner.nextInt();
        
        while (nota < 0 || nota > 10) {
            System.out.println("Voce digitou uma nota invalida!");
            System.out.printf("Digite novamente: ");
            nota = scanner.nextInt();
        }

        
        
        /*if (nota > 10) {
            System.out.println("Voce digitou uma nota invalida!");
        }
        if (nota < 0) {
            System.out.println("Voce digitou uma nota invalida!"); 
        }*/

        
    }
}
