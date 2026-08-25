public class FabricaCirculo implements iFabricaForma {
    public iForma criarForma() {
        return new Circulo();
    }
}
