package lucasvargas.bootcampinter.POO;

public class RodarAplicacaoCarro {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        Exercicio01Carro Carro01 = new Exercicio01Carro("PRETO", "GOL", 59);
        System.out.println("A cor e: " + Carro01.getCor());
        System.out.println("O modelo e: " + Carro01.getModelo());
        System.out.println("O combustivel e: " + Carro01.TotalValorCombustivel(5.50));

    }
}
