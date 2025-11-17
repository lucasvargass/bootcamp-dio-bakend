package lucasvargas.bootcampinter.Retornos;

public class MainExecutavelRetorno {
    
    public static void main(String[] args) {
        
        Exercicios01QuadriRetorno Area = new Exercicios01QuadriRetorno();
        double ResultadoArea = Area.area(5);
        System.out.println("Area do Quadrado: " + ResultadoArea);

        Exercicios01QuadriRetorno AreaTriangulo = new Exercicios01QuadriRetorno();
        double ResultadoTriangulo = AreaTriangulo.areaT(6, 8);
        System.out.println("Area do Triangulo: " + ResultadoTriangulo);

        Exercicios01QuadriRetorno AreaTrapezio = new Exercicios01QuadriRetorno();
        double ResultadoTrapezio = AreaTrapezio.areaTR(10, 7, 5);
        System.out.println("Area do Trapezio: " + ResultadoTrapezio);

        Exercicios01QuadriRetorno AreaLosango = new Exercicios01QuadriRetorno();
        float ResultadoLosango = AreaLosango.areaLo(10, 4);
        System.out.println("Area do Losango: " + ResultadoLosango);

    }
}
