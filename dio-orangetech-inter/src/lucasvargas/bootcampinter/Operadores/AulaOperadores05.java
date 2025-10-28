package lucasvargas.bootcampinter.Operadores;

public class AulaOperadores05 {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        // OPERADORES LOGICOS
        
        boolean condicao01 = true;
        boolean condicao02 = true;

        if (condicao01 && condicao02) {
            System.out.println("As duas condições são verdadeiras!");
        }
        if (condicao01 || condicao02) {
            System.out.println("Uma das condições e verdadeiras!");
        }
        if (condicao01 && (7 > 6)) {
            System.out.println("A condição sera verdadeira!");
        }
    }
}
