package Preparo_AV.ex2;

public class Checkout {
    private AbsFabricaPais fabrica;

    public Checkout(AbsFabricaPais fabrica){
        this.fabrica = fabrica;
    }

    public void finalizarPedido(){
        AbsDocumentoFiscal documento = fabrica.criaDocumentoFiscal();
        AbsPagamento pagamento = fabrica.criaPagamento();
        AbsEtiqueta etiqueta = fabrica.criaEtiqueta();

        System.out.println(documento.descricao());
        System.out.println(pagamento.descricao());
        System.out.println(etiqueta.descricao());
        System.out.println();
    }
}
