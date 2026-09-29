public class ApoliceViagem extends AbsApolice {
    private static int contador = 1;
    private String numero, segurado;
    private int dias;
    private boolean internacional, possuiPassaporte;
    private double coberturaMedica;

    public ApoliceViagem(String segurado, int dias, boolean internacional, double coberturaMedica, boolean possuiPassaporte) {
        this.numero = "VIA-" + contador;
        this.segurado = segurado;
        this.dias = dias;
        this.internacional = internacional;
        this.coberturaMedica = coberturaMedica;
        this.possuiPassaporte = possuiPassaporte;

        contador++;
    }

    @Override
    double calculaPremio() {
        return (dias * 15.0) + (internacional ? 100 : 0);
    }

    @Override
    boolean validaCobertura() {
        return !internacional || (coberturaMedica >= 30000 && possuiPassaporte);
    }

    @Override
    String listaDocumentos() {
        return "Itinerário de viagem" + (internacional ? ", passaporte" : "");
    }

    @Override
    String geraResumos() {
        return numero + " | " + segurado + " | " + java.time.LocalDate.now()
                + " | R$ " + String.format("%.2f", calculaPremio()) + " | " + listaDocumentos();
    }
}