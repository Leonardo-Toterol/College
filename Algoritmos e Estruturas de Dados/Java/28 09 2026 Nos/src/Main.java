public class Main {

    public static void main(String[] args){

        Pilha<Integer> pilha = new Pilha();

        pilha.empilhar(3);
        pilha.empilhar(5);
        pilha.empilhar(7);

        pilha.desempilhar();

        pilha.exibir();
    }
}
