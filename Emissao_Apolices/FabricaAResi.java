public class FabricaAResi extends AbsFabrica {
    private String segurado;
    private double valorImovel;
    private boolean e_altoPadrao, temEscritura;

    public FabricaAResi(String segurado, double valorImovel, boolean e_altoPadrao, boolean temEscritura) {
        this.segurado = segurado;
        this.valorImovel = valorImovel;
        this.e_altoPadrao = e_altoPadrao;
        this.temEscritura = temEscritura;
    }

    @Override
    AbsApolice fabricaApolice() {
        return new ApoliceResidencial(segurado, valorImovel, e_altoPadrao, temEscritura);
    }
}