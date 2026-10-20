package Preparo_AV.ex2;

public class NFe extends AbsDocumentoFiscal{
    private double valorPedido;
 
    public NFe(double valorPedido){
        this.valorPedido = valorPedido;
    }
 
    @Override
    public String descricao(){
        return String.format("Documento fiscal: NF-e com ICMS de 18%% (R$ %.2f)", valorPedido * 0.18);
    }
}
