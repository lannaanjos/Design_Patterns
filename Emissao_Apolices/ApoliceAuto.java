public class ApoliceAuto extends AbsApolice{
    private static int contador = 1;

    private String numero, segurado;
    private double valorFipe, coberturaTerceiros;
    private int idadeMotorista, anosHabilitacao;

    public ApoliceAuto(String segurado, double valorFipe, int idadeMotorista, int anosHabilitacao, double coberturaTerceiros){
        this.numero = "Auto-" + contador;
        this.segurado = segurado;
        this.valorFipe = valorFipe;
        this.idadeMotorista = idadeMotorista;
        this.anosHabilitacao = anosHabilitacao;
        this.coberturaTerceiros = coberturaTerceiros;

        contador++;
    }

    @Override
    double calcularPemio() {
        double premioAnual = valorFipe * 0.08;
        if (idadeCondutor < 25) premioAnual *= 1.30;
        if (anosHabilitacao < 2) premioAnual *= 1.20;
        return premioAnual / 12;
    }

    @Override
    boolean validaCobertura() {
        return coberturaTerceiros >= 50_000;
    }

    @Override
    String listaDocumentos() {
        return "CNHm CRLV, comprovante de residente"
    }

}
