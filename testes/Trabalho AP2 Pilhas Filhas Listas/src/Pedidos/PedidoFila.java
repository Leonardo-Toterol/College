package Pedidos;

public class PedidoFila {
    private Node inicio;
    private Node fim;
    private int tamanho;

    public PedidoFila() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public boolean enfileirar(Pedido pedido) {
        Node novoNode = new Node(pedido);

        if (estaVazia()) {
            inicio = novoNode;
            fim = novoNode;
        } else {
            fim.setProximo(novoNode);
            fim = novoNode;
        }

        tamanho++;
        return true;
    }

    public Pedido desenfileirar() {

        if (estaVazia()) {
            return null;
        }

        Pedido pedidoRemovido = inicio.getPedido();
        inicio = inicio.getProximo();
        tamanho--;

        if (inicio == null) {
            fim = null;
        }

        return pedidoRemovido;
    }

    public void listar() {
        if (estaVazia()) {
            System.out.println("Sem pedidos.");
            return;
        }

        Node atual = inicio;

        while (atual != null) {
            Pedido pedido = atual.getPedido();

            System.out.println("ID: " + pedido.getId() + " - " + pedido.getPedido() );
            atual = atual.getProximo();
        }
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean estaVazia() {
        return inicio == null;
    }
}
