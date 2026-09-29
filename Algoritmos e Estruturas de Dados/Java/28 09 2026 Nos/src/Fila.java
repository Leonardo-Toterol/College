public class Fila<T> {

    private No<T> fila;
    private int tamanho;

    public Fila(){
        this.fila = null;
        this.tamanho = 0;
    }

    public void enfileirar(T valor){
        No<T> novoNo = new No<>(valor);

        if (fila == null){
            fila = novoNo;
        }
        else {
            No<T> noAtual = fila;

            while (noAtual.getProximo() != null){
                noAtual = noAtual.getProximo();
            }
            noAtual.setProximo(novoNo);
        }
        tamanho++;
    }

    public void desenfileirar(){

        if (fila == null){
            System.out.println("Fila está vazia.");
            return;
        }
        fila = fila.getProximo();
        tamanho--;
    }

    public void primeiro(){
        if (fila == null){
            System.out.println("Lista vazia.");
        }
        else {
            System.out.println(fila.getElemento());
        }
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public void exibir(){

        if (fila == null){
            System.out.println("Lista vazia.");
        }
        else {
            No atual = fila;

            while (atual != null){
                System.out.print(atual.getElemento() + " -> ");
                atual = atual.getProximo();
            }
            System.out.println();
        }
    }
}
