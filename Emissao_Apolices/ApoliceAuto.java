public class ApoliceAuto extends AbsApolice{
    private static int contador = 1;

    private String numero, segurado;
    private double valorFipe, coberturaTerceiros;
    private int idadeMotorista, anosHabilitacao;

    public ApoliceAuto(String segurado, double valorFipe, int idadeMotorista, int anosHabilitacao, double coberturaTerceiros){
        this.numero = "AUTO-" + contador;
        this.segurado = segurado;
        this.valorFipe = valorFipe;
        this.idadeMotorista = idadeMotorista;
        this.anosHabilitacao = anosHabilitacao;
        this.coberturaTerceiros = coberturaTerceiros;

        contador++;
    }

    @Override
    double calculaPremio() {
        double premioAnual = valorFipe * 0.08;
        if (idadeMotorista < 25) premioAnual *= 1.30;
        if (anosHabilitacao < 2) premioAnual *= 1.20;
        return premioAnual / 12;
    }

    @Override
    boolean validaCobertura() {
        return coberturaTerceiros >= 50_000;
    }

    @Override
    String listaDocumentos() {
        return "CNH, CRLV, comprovante de residência";
    }

    @Override
    String geraResumos() {
        return numero + " - " + segurado + " - " + java.time.LocalDate.now()
                + " - R$ " + String.format("%.2f", calculaPremio()) + " - " + listaDocumentos();
    }
}