package lucasvargas.bootcampinter.Metodos;

public class MainExecutavel {
    
    public static void main(String[] args) {
        
        System.out.println("==== MENSAGENS ===="); 

        Exercicios02Mensagem MensagemBomDia = new Exercicios02Mensagem();
        MensagemBomDia.obterMensagem(9);

        Exercicios02Mensagem MensagemBoaTarde = new Exercicios02Mensagem();
        MensagemBoaTarde.obterMensagem(13);

        Exercicios02Mensagem MensagemBoaNoite = new Exercicios02Mensagem();
        MensagemBoaNoite.obterMensagem(18);

        Exercicios02Mensagem MensagemHoraInvalida = new Exercicios02Mensagem();
        MensagemHoraInvalida.obterMensagem(50);

        System.out.println("==== EMPRESTIMO ===="); 

        Exercicios03Emprestimo ParcelaDeDuas = new Exercicios03Emprestimo();
        ParcelaDeDuas.calcular(1000, 2);

        Exercicios03Emprestimo ParcelaDeTres = new Exercicios03Emprestimo();
        ParcelaDeTres.calcular(1000, 3);

        Exercicios03Emprestimo ParcelaInvalida = new Exercicios03Emprestimo();
        ParcelaInvalida.calcular(1000, 4);

    }
}
