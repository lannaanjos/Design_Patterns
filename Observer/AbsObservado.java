import java.util.ArrayList;
import java.util.List;

public abstract class AbsObservado {
    protected  List<AbsObservador> listaObservadores = new ArrayList<AbsObservador>();

    public abstract void inscrever(AbsObservador observador);
    public abstract void remover(AbsObservador observador);
}



