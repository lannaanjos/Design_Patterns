package Preparo_AV.ex1;

public class FabricaAuto extends AbsFabrica{
    protected String nome_segurado;
    protected Double valor_veiculo;
 
    public FabricaAuto(String nome_segurado, Double valor_veiculo){
        this.nome_segurado = nome_segurado;
        this.valor_veiculo = valor_veiculo;
    }
 
    @Override
    AbsApolice fabricaApolice(){
        return new ApoliceAuto(nome_segurado, valor_veiculo);
    }

}
