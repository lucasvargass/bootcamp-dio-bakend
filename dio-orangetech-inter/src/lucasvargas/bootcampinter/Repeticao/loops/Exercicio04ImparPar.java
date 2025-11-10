package lucasvargas.bootcampinter.Repeticao.loops;

import java.util.Scanner;

public class Exercicio04ImparPar {
    
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args) {
        
        /*
        Faça um programa que peça N números inteiros,
        calcule e mostre a quantidade de números pares
        e a quantidade de números impares.
        */

        int  qntdnumeros = 0;
        int numero;
        int count = 0;
        int qntPares = 0, qntdImpares = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite a Quantidade de numero: ");
        qntdnumeros = scanner.nextInt();

        do{
            System.out.printf("Digite o numero: ");
            numero = scanner.nextInt();
            count++;

            if (numero % 2 == 0) qntPares++;
            else qntdImpares++;

        } while(count < qntdnumeros);

        System.out.println("Quantidade de numeros PARES: " + qntPares);
        System.out.println("Quantidade de numero IMPAR: " + qntdImpares);



    }
}
