public class Consumidor {
    // A ideia do factory method é o consumidor só consumir as fábricas
    static void main(String[] args) {
        iFabricaForma fabrica = new FabricaRetangulo();
        iForma retangulo = FabricaRetangulo.criarForma();
        retangulo.desenhar();
    }
}
