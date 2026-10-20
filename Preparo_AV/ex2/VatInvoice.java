package Preparo_AV.ex2;

public class VatInvoice extends AbsDocumentoFiscal{
    private double valorPedido;
 
    public VatInvoice(double valorPedido){
        this.valorPedido = valorPedido;
    }
 
    @Override
    public String descricao(){
        return String.format("Documento fiscal: VAT invoice com imposto de 19%% (EUR %.2f)", valorPedido * 0.19);
    }

}
