public class ClienteSingleton {
    // Atributo privado para a instância
    static ClienteSingleton instancia;

    // Construtor privado
    private ClienteSingleton(){
        instancia = new ClienteSingleton();
    }

    // Método para entrega na instância
    public ClienteSingleton getInstance(){
        if (this.instancia == null){
            new ClienteSingleton();
        }

        return new ClienteSingleton();
    }
}