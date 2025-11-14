package lucasvargas.bootcampinter.Metodos;

import java.util.Scanner;

public class Exercicios01Calculadora {

    // CALCULADORA

    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        
        double numero01 = 0;
        double numero02 = 0;
        int modelo = 0;
        String nomeUsuario;

        Scanner scan = new Scanner(System.in);

        System.out.println("===== CALCULADORA =====");

        System.out.printf("Me fale o seu nome: ");
        nomeUsuario = scan.nextLine();

        System.out.printf(nomeUsuario + " Digite um numero: ");
        numero01 = scan.nextInt();

        System.out.printf(nomeUsuario + " Digite outro numero: ");
        numero02 = scan.nextInt();

        System.out.println(nomeUsuario + " Selecione o modelo do Calculo: ");
        System.out.println("0 - Somar");
        System.out.println("1 - Subtrair");
        System.out.println("2 - Multiplicar");
        System.out.println("3 - Dividir");
        System.out.printf("Resposta: ");
        modelo = scan.nextInt();

        switch (modelo) {
            case 0:
                somar(numero01, numero02, nomeUsuario);
                break;

            case 1:
                subtrair(numero01, numero02, nomeUsuario);
                break;

            case 2:
                multiplicar(numero01, numero02, nomeUsuario);
                break;

            case 3:
                dividir(numero01, numero02, nomeUsuario);
                break;

            default:
                System.out.println("Você selecionou o Modelo Inexistente!");
                
        }

    }
    
    public static void somar (double numero01, double numero02, String nomeUsuario){{

        double resultadoSomar = numero01 + numero02;
        System.out.println(nomeUsuario + " o Resultado da soma e: " + resultadoSomar);
        return;
    }}

    public static void subtrair (double numero01, double numero02, String nomeUsuario){

        double resultadoSubtracao = numero01 - numero02;
        System.out.println(nomeUsuario + " o Resultado da Subtração e: " + resultadoSubtracao);
        return;
    }

    public static void multiplicar (double numero01, double numero02, String nomeUsuario){

        double resultadoMultiplicar = numero01 * numero02;
        System.out.println(nomeUsuario + " o Resultado da Multiplicação e: " + resultadoMultiplicar);
        return;
    }

    public static void dividir (double numero01, double numero02, String nomeUsuario){

        double resultadoDividir = numero01 / numero02;
        System.out.println(nomeUsuario + " o Resultado da divisão e: " + resultadoDividir);
        return;
    }
}
