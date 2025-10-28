package lucasvargas.bootcampinter.Operadores;

import java.sql.Date;

public class AulaOperadores01 {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        String nome = "LUCAS";
        int idade = 19;
        double peso = 22.89;
        char sexo = 'M';
        boolean doadorOrgao = true;
        Date dateDoNascimento = new Date(sexo);

        double soma = 9 + 19;
        int subtração = 9 - 7;
        int multiplicação = 45 * 9;
        int divisao = 78 / 34;
        int modulo = 18 % 9;
        double resultado = (12 * 8) + (34 * 5);

        // CONCATENAÇÃO

        String nomeCompleto = "LINGUAGEM" + " JAVA";
        System.out.println(nomeCompleto); 
        
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);




    }
}
