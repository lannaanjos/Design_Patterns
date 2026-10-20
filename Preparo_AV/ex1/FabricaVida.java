package Preparo_AV.ex1;

public class FabricaVida extends AbsFabrica {
    protected String nome_segurado;
    protected Double capital_segurado;
 
    public FabricaVida(String nome_segurado, Double capital_segurado){
        this.nome_segurado = nome_segurado;
        this.capital_segurado = capital_segurado;
    }
 
    @Override
    AbsApolice fabricaApolice(){
        return new ApoliceVida(nome_segurado, capital_segurado);
    }

    
}
