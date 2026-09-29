public class FabricaAVida extends AbsFabrica {
    private String segurado;
    private int idade;
    private double capitalSegurado;
    private boolean fumante, possuiAtestado;

    public FabricaAVida(String segurado, int idade, double capitalSegurado, boolean fumante, boolean possuiAtestado) {
        this.segurado = segurado;
        this.idade = idade;
        this.capitalSegurado = capitalSegurado;
        this.fumante = fumante;
        this.possuiAtestado = possuiAtestado;
    }

    @Override
    AbsApolice fabricaApolice() {
        return new ApoliceVida(segurado, idade, capitalSegurado, fumante, possuiAtestado);
    }
}