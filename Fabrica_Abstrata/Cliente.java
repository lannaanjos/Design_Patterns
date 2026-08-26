public class Cliente {
    public static void main(String[] args) {
        // Preciso de um produto A1
        AbsProdutoA pA = new Fabrica1().criarProdutoA(); // não conheço nada, só pedi o produto

        // Preciso de um produto B2
        AbsProdutoB pB = new Fabrica2().criarProdutoB(); // Podia ser melhor,
        // Poderia deixar sem o programador de bordo ter que conhecer a classe abstrata
        // A ideia é sempre reduzir a complexidade, esconder as classes abstratas e interfaces

    }
}
