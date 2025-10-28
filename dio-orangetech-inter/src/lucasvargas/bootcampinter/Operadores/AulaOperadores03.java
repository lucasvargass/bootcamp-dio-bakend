package lucasvargas.bootcampinter.Operadores;

public class AulaOperadores03 {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        // OPERADOR TERNARIO

        int numero01 = 10;
        int numero02 = 10;

        String resultado = numero01 == numero02 ? "Verdadeiro" : "Falso";

        System.out.println(resultado);

        int resultado02 = numero01 == numero02 ? 1 : 0;

        System.out.println(resultado02);
        
        
        int letraA = 8;
        int letraB = 7;

        if (letraA==letraB) {
            System.out.println("Verdadeiro");
        }
        else{
            System.out.println("Falso");
        }
    }
}
