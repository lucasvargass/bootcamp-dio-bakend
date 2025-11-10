package lucasvargas.bootcampinter.Repeticao.loops;

import java.util.Scanner;

public class Exercicio05Tabuada {
    
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args) {
        
        /*
        Desenvolva um gerador de tabuada,
        capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
        O usuário deve informar de qual numero ele deseja ver a tabuada.
        A saída deve ser conforme o exemplo abaixo:

        Tabuada de 5:
        5 X 1 = 5
        5 X 2 = 10
        ...
        5 X 10 = 50
        */

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite a Tabuada: ");
        int tabuada = scanner.nextInt();

        System.out.println("Tabuade de: " + tabuada);
        for (int i = 0; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }

    }
}
