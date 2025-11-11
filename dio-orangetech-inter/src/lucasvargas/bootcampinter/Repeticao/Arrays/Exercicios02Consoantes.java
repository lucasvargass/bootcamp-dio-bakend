package lucasvargas.bootcampinter.Repeticao.Arrays;

import java.util.Scanner;

public class Exercicios02Consoantes {
    
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args) {
        
        /*
        Faça um Programa que leia um vetor de 6 caracteres,
        e diga quantas consoantes foram lidas.
        Imprima as consoantes.
        */
        
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qntdconsoantes = 0;

        int count = 0;
        do {
            System.out.printf("Letras: ");
            String letras = scan.nextLine();

            if (letras.equalsIgnoreCase("a") |
                letras.equalsIgnoreCase("e") |
                letras.equalsIgnoreCase("i") |
                letras.equalsIgnoreCase("o") |
                letras.equalsIgnoreCase("u")) {
                
                consoantes[count] = letras;
                qntdconsoantes++;
                
            }

            count++;
            
        } while (count < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes) {
            if (consoante != null) {
                System.out.printf(consoante + " ");
            }
        }

        System.out.printf("Quantidade de Consoantes: " + qntdconsoantes);
        System.out.println(consoantes.length);


    }
}
