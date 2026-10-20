package Preparo_AV.ex1;

public class Main {
    public static void main(String[] args){
        AbsFabrica fabricaAuto = new FabricaAuto("Lanna", 75_000.00);
        fabricaAuto.emitir();

        AbsFabrica fabricaResi = new FabricaResi("Arthur", 350_000.00);
        fabricaResi.emitir();

        AbsFabrica fabricaVida = new FabricaVida("Bruna", 50_000.00);
        fabricaVida.emitir();
    }
}

// Método usado: Abstract Factory