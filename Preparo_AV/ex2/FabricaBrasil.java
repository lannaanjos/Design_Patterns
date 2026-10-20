package Preparo_AV.ex2;

public class FabricaBrasil extends AbsFabricaPais {
        private double valorPedido;
 
    public FabricaBrasil(double valorPedido){
        this.valorPedido = valorPedido;
    }
 
    @Override
    public AbsDocumentoFiscal criaDocumentoFiscal(){
        return new NFe(valorPedido);
    }
 
    @Override
    public AbsPagamento criaPagamento(){
        return new Pix();
    }
 
    @Override
    public AbsEtiqueta criaEtiqueta(){
        return new EtiquetaCorreios();
    }
}
