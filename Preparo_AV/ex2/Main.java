package Preparo_AV.ex2;

public class Main {
    public static void main(String[] args){
        Checkout pedidoBrasil = new Checkout(new FabricaBrasil(1_000.00));
        pedidoBrasil.finalizarPedido();

        Checkout pedidoAlemanha = new Checkout(new FabricaAlemanha(1_000.00));
        pedidoAlemanha.finalizarPedido();
    }
}
