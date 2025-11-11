package lucasvargas.bootcampinter.Repeticao.Arrays;

public class Exercicios01OrdemInversa {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        /*
        Crie um vetor de 6 números inteiros
        e mostre-os na ordem inversa.
        */

        int[] vetor = {-5, -6, 15, 50, 8, 4};

        // System.out.println(vetor.length);

        System.out.printf("Vetor: ");
        int count = 0;
        while (count < (vetor.length)) {
            System.out.printf(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.printf(vetor[i] + " ");
        }



    }
}
