package lucasvargas.bootcampinter.POO;

public class Exercicio01Carro {
    
    String cor;
    String modelo;
    int CapacidadeTanque;

    // constructor

    Exercicio01Carro (String cor, String modelo, int CapacidadeTanque){

        this.cor = cor;
        this.modelo = modelo;
        this.CapacidadeTanque = CapacidadeTanque;
    }

    void setCor (String cor){

        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setModelo (String modelo){

        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setCapacidadeTanque (int CapacidadeTanque){

        this.CapacidadeTanque = CapacidadeTanque;
    }

    int getCapacidadeTanque(){
        return CapacidadeTanque;
    }

    double TotalValorCombustivel (double valorCombustivel){
        return CapacidadeTanque * valorCombustivel;
    }

}
