public class Consumidor {
    // A ideia do factory method é o consumidor só consumir as fábricas
    static void main(String[] args) {
        iFabricaForma fabricaDeRetangulo = new FabricaRetangulo();
        iForma retangulo = fabricaDeRetangulo.criarForma();
        retangulo.desenhar();

        iFabricaForma fabricaDeCirculo = new FabricaCirculo();
        iForma circulo = fabricaDeCirculo.criarForma();
        circulo.desenhar();

        iFabricaForma fabricaDeTriangulo = new FabricaTriangulo();
        iForma triangulo = fabricaDeTriangulo.criarForma();
        triangulo.desenhar();
    }
}
