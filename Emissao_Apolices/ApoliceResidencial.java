public class ApoliceResidencial extends AbsApolice {
    private static int contador = 1;
    private String numero, segurado;
    private double valorImovel;
    private boolean e_altoPadrao, temEscritura;

    public ApoliceResidencial(String segurado, double valorImovel, boolean e_altoPadrao, boolean temEscritura) {
        this.numero = "RES-" + contador;
        this.segurado = segurado;
        this.valorImovel = valorImovel;
        this.e_altoPadrao = e_altoPadrao;
        this.temEscritura = temEscritura;

        contador++;
    }
 
    @Override
    double calculaPremio() {
        double premioAnual = valorImovel * 0.015;
        if (e_altoPadrao) premioAnual *= 1.25;
        return premioAnual / 12;
    }
 
    @Override
    boolean validaCobertura() {
        return temEscritura;
    }
 
    @Override
    String listaDocumentos() {
        return "Escritura ou contrato de locação, comprovante de residência";
    }
 
    @Override
    String geraResumos() {
        return numero + " - " + segurado + " - " + java.time.LocalDate.now()
                + " - R$ " + String.format("%.2f", calculaPremio()) + " - " + listaDocumentos();
    }
}