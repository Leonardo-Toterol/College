public class ListaLigada {

        private No inicio;

        public ListaLigada(){
            this.inicio = null;
        }

    public void inserirFim(String elemento){

        No novoNo = new No(elemento);

        if (inicio == null){
            inicio = novoNo;
        }
        else {
            No noAtual = inicio;

            while (noAtual.getProximo() != null){
                noAtual = noAtual.getProximo();
            }
            noAtual.setProximo(novoNo);
        }
    }

    public void removerPorValor(String elemento){

        if (inicio == null){
            System.out.println("A lista está vazia.");
            return;
        }

        if (inicio.getElemento().equals(elemento)){
            inicio = inicio.getProximo();
            return;
        }

        No atual = inicio;
        No anterior = null;

        while (atual != null && atual.getElemento() != elemento){
            anterior = atual;
            atual = atual.getProximo();
        }

        if (atual == null){
            System.out.println("Elemento não encontrado.");
            return;
        }
        anterior.setProximo(atual.getProximo());
    }

    public void exibir(){

            if (inicio == null){
                System.out.println("Lista vazia.");
            }
            else {
                No atual = inicio;

                while (atual != null){
                    System.out.print(atual.getElemento() + " -> ");
                    atual = atual.getProximo();
                }
                System.out.println();
            }
    }


}
