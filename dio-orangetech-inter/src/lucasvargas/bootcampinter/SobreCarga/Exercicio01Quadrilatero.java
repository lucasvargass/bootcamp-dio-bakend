package lucasvargas.bootcampinter.SobreCarga;

public class Exercicio01Quadrilatero {
    
    public void area (double lado){

        System.out.println("Area do Quadrado: " + lado * lado);
    }

    public void areaT (double lado01, double lado02){

        System.out.println("Area do Triangulo: " + lado01 * lado02);
    }

    public void areaTR (double BaseMaior, double BaseMenor, double Altura){

        System.out.println("Area do Trapezio: " + ((BaseMaior + BaseMenor)*Altura) / 2);
    }

    public void areaLo (float Diagonal01, float Diagonal02){

        System.out.println("Area do Losango: " + (Diagonal01 * Diagonal02) / 2);
    }


}
