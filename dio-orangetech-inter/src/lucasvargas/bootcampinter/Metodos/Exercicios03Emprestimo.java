package lucasvargas.bootcampinter.Metodos;

public class Exercicios03Emprestimo {
    
    public static Object getDuasParcelas;

    public static int getDuasParcelas (){

        return 2;
    }

    public static int getTresParcelas (){

        return 3;
    }

    public static double getTaxaDuasParcelas (){

        return 0.3;
    }

    public static double getTaxaTresParcelas (){

        return 0.45;
    }

    @SuppressWarnings("unused")
    public void calcular (double valor, int parcelas){

        if (parcelas == 2) {

            double valorFinal01 = valor + (valor * getTaxaDuasParcelas());

            System.out.println("Valor final do emprestimo de 2 parcelas e: " + valorFinal01);

        }else if (parcelas == 3) {

            double valorFinal02 = valor + (valor * getTaxaTresParcelas());

            System.out.println("Valor final do emprestimo de 3 parcelas e: " + valorFinal02);
            
        }else{

            System.out.println("Quantidade de parcelas não aceita!");
        }
    }
}
