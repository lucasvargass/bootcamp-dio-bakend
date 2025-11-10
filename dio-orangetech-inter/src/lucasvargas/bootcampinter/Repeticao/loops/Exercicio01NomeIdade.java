package lucasvargas.bootcampinter.Repeticao.loops;

import java.util.Scanner;

public class Exercicio01NomeIdade {
    
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        
        /*
        Faça um programa que leia conjuntos de dois valores,
        o primeiro representando o nome do aluno e o segundo representando a sua idade.
        (Pare o programa inserindo o valor 0 no campo nome)
        */

        String nome;
        int idade = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            System.out.printf("Digite o seu nome: ");
            nome = scanner.next();

            if (nome.equals("0")) {
                System.out.println("Foi finalizado com sucesso!"); 
                break;
            }

            System.out.printf("Digite a sua idade: ");
            idade = scanner.nextInt();

            if (idade >= 100) {
                System.out.println("Obs: idade nao existe!");
                continue;
            }
        }


    }
}
