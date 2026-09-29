public class Main {

    public static void main(String[] args){

        Fila fila = new Fila();

        fila.enfileirar("Leo");
        fila.enfileirar("Jorge");
        fila.enfileirar("Pedro");

        fila.desenfileirar();

        fila.enfileirar("Rafael");

        fila.exibir();

        fila.primeiro();
    }
}
