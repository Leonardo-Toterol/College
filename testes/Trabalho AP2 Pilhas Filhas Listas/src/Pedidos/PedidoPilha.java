package Pedidos;

public class PedidoPilha {
    private Node topo;
    private int tamanho;

    public PedidoPilha() {
        this.topo = null;
        this.tamanho = 0;
    }

    public boolean empilhar(Pedido pedido) {

        Node novoNode = new Node(pedido);

        novoNode.setProximo(topo);
        topo = novoNode;
        tamanho++;

        return true;
    }

    public Pedido desempilhar() {
        if (estaVazia()) {
            return null;
        }

        Pedido pedidoRemovido = topo.getPedido();
        topo = topo.getProximo();
        tamanho--;

        return pedidoRemovido;
    }

    public void listar() {

        Node atual = topo;

        if (estaVazia()) {
            System.out.println("Sem pedido.");
            return;
        }

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
        return topo == null;
    }
}
