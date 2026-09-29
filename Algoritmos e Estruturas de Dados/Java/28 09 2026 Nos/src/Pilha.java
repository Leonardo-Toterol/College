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

        No atual = pilha;
        No anterior = null;

        while (atual != null){
            anterior = atual;
            atual = atual.getProximo();
        }
        anterior.setProximo(atual.getProximo());
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
            System.out.println(getTamanho());
        }
    }
}
