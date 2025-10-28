package lucasvargas.bootcampinter.Operadores;

public class AulaOperadores04 {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        // OPERADORES RELACIONAIS

        int numero01 = 1;
        int numero02 = 2;

        boolean simOUnao = numero01 == numero02;

        System.out.println("Numero 1 e igual a Numero 2 ? " + simOUnao);

        simOUnao = numero01 != numero02;

        System.out.println("Numero 1 e diferente a Numero 2 ? " + simOUnao);

        simOUnao = numero01 > numero02;

        System.out.println("Numero 1 e maior que Numero 2 ? " + simOUnao);

        if (numero01 != numero02) {
            System.out.println("A nossa condição e Verdadeiro");
        }else{
            System.out.println("A nossa condição e Falso");
        }

        String nome01 = "LUCAS";
        String nome02 = "FERNANDO";

        System.out.println("A condição e " + nome01 == nome02);

        String sobrenome01 = "VARGAS";
        String sobrenome02 = new String("VARGAS");

        System.out.println(sobrenome01.equals(sobrenome02));


    }
}
