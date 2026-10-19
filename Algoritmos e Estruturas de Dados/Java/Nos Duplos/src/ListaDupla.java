public class ListaDupla<T> {

    private Node<T> inicio;
    private Node<T> fim;

    public ListaDupla() {
        this.inicio = null;
        this.fim = null;
    }

    public void adicionar(T valor) {

        Node<T> novoNode = new Node<>(valor);

        if (inicio == null) {
            inicio = novoNode;
            fim = novoNode;
        } else {
            fim.setProximo(novoNode);
            novoNode.setAnterior(fim);
            fim = novoNode;
        }
    }

    public void adicionarNoInicio(T dado) {
        Node<T> novoNo = new Node<>(dado);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            novoNo.setProximo(inicio);
            inicio.setAnterior(novoNo);
            inicio = novoNo;
        }
    }

    public void remover(T dado) {
        if (inicio == null) return;

        Node<T> atual = inicio;

        while (atual != null) {

            if (atual.getValor().equals(dado)) {

                if (atual == inicio) {
                    inicio = atual.getProximo();

                    if (inicio != null) {
                        inicio.setAnterior(null);
                    } else {
                        fim = null;
                    }

                } else if (atual == fim) {
                    fim = atual.getAnterior();
                    fim.setProximo(null);

                } else {
                    atual.getAnterior().setProximo(atual.getProximo());
                    atual.getProximo().setAnterior(atual.getAnterior());
                }

                return;
            }

            atual = atual.getProximo();
        }
    }

    public boolean contem(T dado) {
        Node<T> atual = inicio;
        while (atual != null) {
            if (atual.getValor().equals(dado)) {
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }

    public void imprimirLista() {
        Node<T> atual = inicio;
        while (atual != null) {
            System.out.print(atual.getValor() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }


}


