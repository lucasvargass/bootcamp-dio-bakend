package lucasvargas.bootcampinter.SobreCarga;

public class MainExecutavelQuadri {
    
    public static void main(String[] args) {
        
        Exercicio01Quadrilatero AreaDoQuadrado = new Exercicio01Quadrilatero();
        AreaDoQuadrado.area(3);

        Exercicio01Quadrilatero AreaDoTriangulo = new Exercicio01Quadrilatero();
        AreaDoTriangulo.areaT(5, 5);

        Exercicio01Quadrilatero AreaDoTrapezio = new Exercicio01Quadrilatero();
        AreaDoTrapezio.areaTR(10, 5, 20);

        Exercicio01Quadrilatero AreaDoLosango = new Exercicio01Quadrilatero();
        AreaDoLosango.areaLo(5,5);
    }
}
