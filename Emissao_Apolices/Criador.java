public class Criador {
    public static void main(String[] args) {
        AbsFabrica fabricaAuto = new FabricaAAuto("Ana", 45000, 22, 1, 60000);
        AbsApolice auto = fabricaAuto.fabricaApolice();
        System.out.println(auto.validaCobertura() ? auto.geraResumos() : "Contratação rejeitada");

        AbsFabrica fabricaResi = new FabricaAResi("Bruno", 300000, true, true);
        AbsApolice resi = fabricaResi.fabricaApolice();
        System.out.println(resi.validaCobertura() ? resi.geraResumos() : "Contratação rejeitada");

        AbsFabrica fabricaVida = new FabricaAVida("Carla", 35, 200000, false, false);
        AbsApolice vida = fabricaVida.fabricaApolice();
        System.out.println(vida.validaCobertura() ? vida.geraResumos() : "Contratação rejeitada");

        AbsFabrica fabricaViagem = new FabricaAViagem("Diego", 10, true, 35000, true);
        AbsApolice viagem = fabricaViagem.fabricaApolice();
        System.out.println(viagem.validaCobertura() ? viagem.geraResumos() : "Contratação rejeitada");
    }
}