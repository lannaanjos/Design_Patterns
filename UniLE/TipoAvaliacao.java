import java.util.List;

abstract class TipoAvaliacao<T> {
    public abstract Resultado avaliar(List<T> avaliacoes);
}