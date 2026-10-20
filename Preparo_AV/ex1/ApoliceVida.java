package Preparo_AV.ex1;

public class ApoliceVida extends AbsApolice {
    protected String nome_segurado;
    protected Double capital_segurado;

    public ApoliceVida(String nome_segurado, Double capital_segurado){
        this.nome_segurado = nome_segurado;
        this.capital_segurado = capital_segurado;
    }

    @Override
    double calculaPremio(){
        return (capital_segurado * 0.03)/12;
    }

    @Override
    String documentos_exigidos(){
        return "Identidade e CPF";
    }

    @Override
    String geraResumo(){
        return String.format("Apólice Vida%nNome do segurado: %s%nPrêmio mensal: R$ %.2f%nDocumentos exigidos: %s%n", nome_segurado, calculaPremio(), documentos_exigidos());
    }
}
