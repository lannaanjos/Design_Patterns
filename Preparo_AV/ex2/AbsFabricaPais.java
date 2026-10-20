package Preparo_AV.ex2;

public abstract class AbsFabricaPais {
    public abstract AbsDocumentoFiscal criaDocumentoFiscal();
 
    public abstract AbsPagamento criaPagamento();
 
    public abstract AbsEtiqueta criaEtiqueta();
}
