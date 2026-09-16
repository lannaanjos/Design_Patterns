public class Observador extends AbsObservador {
    private AbsObservador observado;

    // Implementar o construtor
    public observador(AbsObservado Observado){
        this.observado = Observado;
        this.observado.inscrever(this);
    }
}