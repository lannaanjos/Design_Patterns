public class Observado extends AbsObservado {
    // propriedade de interesse é o estado
    private int state;

    public int getState(){
        return this.state;
    }

    public void setState(int novo_state){
        this.state = novo_state;
        // acionar os métodos update nos observadores inscritos
    }

    private void notificarTodos(){
        for(AbsObservador observador : this.listaObservadores){
                observador.update();
        }
    }

    @Override
    public void inscrever(AbsObservador observador){
        System.out.println("");
    }

    @Override
    public void remover(AbsObservador observador){
        System.out.println("");
    }

    public void update(){
        System.out.println("");
    }

}