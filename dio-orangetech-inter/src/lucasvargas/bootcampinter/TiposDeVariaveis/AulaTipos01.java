package lucasvargas.bootcampinter.TiposDeVariaveis;

public class AulaTipos01 {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        String meuNome = "Lucas Vargas";
        int idade;
        int anoDeFabricação = 2027;
        double salarioMinimo = 2500f;

        byte idade01 = 123;
        short ano = 2024;
        int cep = 2000000;
        long cpf = 20903829;
        float pi = 3.14f;
        double salario = 3000.89;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto02 = (short) numeroNormal;

        // VARIAVEIS CONSTANTES

        int resultado = 8;
        resultado = 9;
        System.out.println(resultado);

        double VALOR_DE_PI = 17.8;
        VALOR_DE_PI = 90.7;

        final double VALOR_DE_PI02 = 88.7;
        /* VALOR_DE_PI02 = 78.6; */



    }
}
