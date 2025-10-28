package lucasvargas.bootcampinter.Operadores;

public class AulaOperadores02 {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        // OPERADORES UNARIOS

        int numero = 5;

        System.out.println(-numero);

        System.out.println(numero);

        int numero02 = 6;

        numero02 = - numero02;

        System.out.println(numero02);

        numero02 = numero02 * - 1;

        System.out.println(numero02);

        // INCREMENTO 

        int resultado = 8;

        resultado = resultado + 2;

        resultado++;

        System.out.println(resultado++);

        System.out.println(++resultado);

        boolean variavel = true;

        System.out.println(!variavel);

        System.out.println(variavel);

        variavel = !variavel;
        
        System.out.println(variavel);


    }
}
