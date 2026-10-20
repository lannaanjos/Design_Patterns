package Preparo_AV.ex1; // pq tá em pasta assim

public abstract class AbsFabrica {
    abstract AbsApolice fabricaApolice();

    public void emitir(){
        AbsApolice apolice = fabricaApolice();
        System.out.println(apolice.geraResumo());
    }
}
