package lucasvargas.bootcampinter.Retornos;

public class Exercicios01QuadriRetorno {

    public double area (double Lado){

        return Lado * Lado;
    }

    public double areaT (double lado01, double lado02){

        return lado01 * lado02;
    }

    public double areaTR (double BaseMaior, double BaseMenor, double Altura){

        return ((BaseMaior + BaseMenor)*Altura) / 2;
    }

    public float areaLo (float Diagonal01, float Diagonal02){

        return (Diagonal01 * Diagonal02) / 2;
    }
}
