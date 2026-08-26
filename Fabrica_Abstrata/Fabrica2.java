public class Fabrica2 extends AbsFabrica {
    @Override
    public AbsProdutoA criarProdutoA() {
        return new ProdutoA2();
    }

    @Override
    public AbsProdutoB criarProdutoB() {
        return new ProdutoB2();
    }
}
