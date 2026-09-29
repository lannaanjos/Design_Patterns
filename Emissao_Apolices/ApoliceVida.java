public class ApoliceVida extends AbsApolice {
    private static int contador = 1;
    private String numero, segurado;
    private int idade;
    private double capitalSegurado;
    private boolean fumante, possuiAtestado;

    public ApoliceVida(String segurado, int idade, double capitalSegurado, boolean fumante, boolean possuiAtestado) {
        this.numero = "VID-" + contador;
        this.segurado = segurado;
        this.idade = idade;
        this.capitalSegurado = capitalSegurado;
        this.fumante = fumante;
        this.possuiAtestado = possuiAtestado;

        contador++;
    }

    @Override
    double calculaPremio() {
        double premio = (idade * 12) + (capitalSegurado * 0.002);
        if (fumante) premio *= 1.50;
        return premio;
    }

    @Override
    boolean validaCobertura() {
        return capitalSegurado <= 500000 || possuiAtestado;
    }

    @Override
    String listaDocumentos() {
        return "Identidade, CPF" + (capitalSegurado > 500000 ? ", atestado médico" : "");
    }

    @Override
    String geraResumos() {
        return numero + " | " + segurado + " | " + java.time.LocalDate.now()
                + " | R$ " + String.format("%.2f", calculaPremio()) + " | " + listaDocumentos();
    }
}