public class FabricaAViagem extends AbsFabrica {
    private String segurado;
    private int dias;
    private boolean internacional, possuiPassaporte;
    private double coberturaMedica;

    public FabricaAViagem(String segurado, int dias, boolean internacional, double coberturaMedica, boolean possuiPassaporte) {
        this.segurado = segurado;
        this.dias = dias;
        this.internacional = internacional;
        this.coberturaMedica = coberturaMedica;
        this.possuiPassaporte = possuiPassaporte;
    }

    @Override
    AbsApolice fabricaApolice() {
        return new ApoliceViagem(segurado, dias, internacional, coberturaMedica, possuiPassaporte);
    }
}