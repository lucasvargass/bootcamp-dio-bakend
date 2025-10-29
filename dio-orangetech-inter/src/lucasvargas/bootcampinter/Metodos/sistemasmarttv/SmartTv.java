package lucasvargas.bootcampinter.Metodos.sistemasmarttv;

public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){

        canal = novoCanal;
    }

    public void aumentarCanal(){

        canal++;
        System.out.println("Aumentando o canal: " + canal);
    }

    public void diminuirCanal(){

        canal--;
        System.out.println("Diminuindo o canal: " + canal);
    }
    
    public void aumentandoVolume(){

        volume++;
        System.out.println("Aumentando o Volume: " + volume);
    }

    public void diminuindoVolume(){

        volume--;
        System.out.println("Diminuindo o Volume: " + volume);
    }
    
    
    public void ligar(){

        ligada = true;
        System.out.println("NOVO STATUS: TV LIGADA ? " + ligada);
    
    }

    public void deligar(){

        ligada = false;
        System.out.println("NOVO STATUS: TV DESLIGADA ? " + ligada);
        
    }

}
