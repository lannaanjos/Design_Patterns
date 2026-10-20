package Preparo_AV.ex1;

public class ApoliceResi extends AbsApolice {
    protected String nome_segurado;
    protected Double valor_imovel;

    public ApoliceResi(String nome_segurado, Double valor_imovel){
        this.nome_segurado = nome_segurado;
        this.valor_imovel = valor_imovel;
    }

    @Override
    double calculaPremio(){
        return (valor_imovel * 0.015)/12;
    }

    @Override
    String documentos_exigidos(){
        return "Escritura ou Contrato de Locação";
    }

    @Override
    String geraResumo(){
        return String.format("Apólice Residencial%nNome do segurado: %s%nPrêmio mensal: R$ %.2f%nDocumentos exigidos: %s%n", nome_segurado, calculaPremio(), documentos_exigidos());
    }
}