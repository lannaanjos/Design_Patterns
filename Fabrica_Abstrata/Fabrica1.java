public class Fabrica1 extends AbsFabrica {
    @Override
    public AbsProdutoA criarProdutoA() {
        return new ProdutoA1();
    }

    @Override
    public AbsProdutoB criarProdutoB() {
        return new ProdutoB1();
    }
}
