public class Pilha<T> {
    private No<T> pilha;
    private int tamanho;

    public Pilha(){
        this.pilha = null;
        this.tamanho = 0;
    }

    public void empilhar(T elemento){

        No<T> novoNo = new No<>(elemento);

        if (pilha == null){
            pilha = novoNo;
        }
        else {
            No<T> noAtual = pilha;

            while (noAtual.getProximo() != null){
                noAtual = noAtual.getProximo();
            }
            noAtual.setProximo(novoNo);
        }
        tamanho++;
    }

    public void desempilhar(){

        if (pilha == null){
            System.out.println("Pilha está vazia.");
            return;
        }

        if (pilha.getProximo() == null){
            pilha = null;
        }
        else {
            No<T> noAtual = pilha;

            while (noAtual.getProximo().getProximo() != null){
                noAtual = noAtual.getProximo();
            }

            noAtual.setProximo(null);
        }

        tamanho--;

    }

    public int getTamanho(){
        return tamanho;
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public void exibir(){

        if (pilha == null){
            System.out.println("Lista vazia.");
        }
        else {
            No atual = pilha;

            while (atual != null){
                System.out.print(atual.getElemento() + " -> ");
                atual = atual.getProximo();
            }
            System.out.println();
        }
    }

    public void topo(){
        if (pilha == null){
            System.out.println("Lista vazia.");
        }
        else {
            No atual = pilha;

            while (atual.getProximo() != null){
                atual = atual.getProximo();
            }
            System.out.println(atual.getElemento());
            System.out.println();
        }
    }

/*Pilha<Integer> pilha = new Pilha();

        pilha.empilhar(3);
        pilha.empilhar(5);
        pilha.empilhar(7);

        pilha.desempilhar();

        pilha.empilhar(7);
        pilha.empilhar(9);

        pilha.exibir();

        pilha.topo();*/
}