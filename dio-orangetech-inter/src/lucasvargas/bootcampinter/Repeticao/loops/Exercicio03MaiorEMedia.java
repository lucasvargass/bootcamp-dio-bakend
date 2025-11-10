package lucasvargas.bootcampinter.Repeticao.loops;

import java.util.Scanner;

public class Exercicio03MaiorEMedia {

    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        
        /*
        Faça um programa que leia 5 números
        e informe o maior número
        e a média desses números.
        */

        int numero;
        int maior = 0;
        int count = 0;
        int soma = 0;

        do {
            
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Digite um numero: ");
            numero = scanner.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;
            count++;

       } while(count < 5);

       System.out.println("Maior numero: " + maior);
       System.out.println("A media: " + (soma/5));

        


    }
}