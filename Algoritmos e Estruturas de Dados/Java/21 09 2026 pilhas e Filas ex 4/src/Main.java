
public class Main{
    public static void main(String[] args){

        Pessoa pessoa = new Pessoa("Leo");
        Pessoa pessoa2 = new Pessoa("Lucas");
        Pessoa pessoa3 = new Pessoa("Luis");

        Fila fila = new Fila(3);

        fila.enfileirar(pessoa);
        fila.enfileirar(pessoa2);
        fila.enfileirar(pessoa3);

        fila.desenfileirar();
        fila.desenfileirar();
        fila.desenfileirar();
        fila.desenfileirar();

    }
}