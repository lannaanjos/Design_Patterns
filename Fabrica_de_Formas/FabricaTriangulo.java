public class FabricaTriangulo implements iFabricaForma {
    @Override
    public iForma criarForma() {
        return new Triangulo();
    }
}
