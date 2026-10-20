package Preparo_AV.ex2;

public class FabricaAlemanha extends AbsFabricaPais {
    private double valorPedido;
 
    public FabricaAlemanha(double valorPedido){
        this.valorPedido = valorPedido;
    }
 
    @Override
    public AbsDocumentoFiscal criaDocumentoFiscal(){
        return new VatInvoice(valorPedido);
    }
 
    @Override
    public AbsPagamento criaPagamento(){
        return new SepaDirectDebit();
    }
 
    @Override
    public AbsEtiqueta criaEtiqueta(){
        return new EtiquetaDeutschePost();
    }
}
