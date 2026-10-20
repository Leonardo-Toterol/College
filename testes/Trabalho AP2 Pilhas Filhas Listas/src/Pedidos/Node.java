package Pedidos;

public class Node {
    private Pedido pedido;
    private Node proximo;

    public Node(Pedido pedido) {
        this.pedido = pedido;
        this.proximo = null;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }
}
