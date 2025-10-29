package lucasvargas.bootcampinter.Metodos.sistemasmarttv;

public class Usuario {
    
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV esta ? " + smartTv.ligada);
        System.out.println("Qual canal esta : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.ligar();
        smartTv.deligar();
        smartTv.aumentandoVolume();
        smartTv.diminuindoVolume();
        smartTv.aumentandoVolume();
        
        smartTv.mudarCanal(4);
        System.out.println("Qual canal esta : " + smartTv.canal);
        
    }
}
