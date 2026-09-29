public class FabricaAAuto extends AbsFabrica {
    private String segurado;
    private double valorFipe, coberturaTerceiros;
    private int idadeMotorista, anosHabilitacao;

    public FabricaAAuto(String segurado, double valorFipe, int idadeMotorista, int anosHabilitacao, double coberturaTerceiros) {
        this.segurado = segurado;
        this.valorFipe = valorFipe;
        this.idadeMotorista = idadeMotorista;
        this.anosHabilitacao = anosHabilitacao;
        this.coberturaTerceiros = coberturaTerceiros;
    }

    @Override
    AbsApolice fabricaApolice() {
        return new ApoliceAuto(segurado, valorFipe, idadeMotorista, anosHabilitacao, coberturaTerceiros);
    }
}