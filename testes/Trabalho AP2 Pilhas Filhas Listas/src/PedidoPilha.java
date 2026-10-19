
public class PedidoPilha {
    private No topo;
    private int tamanho;

    public PedidoPilha() {
        this.topo = null;
        this.tamanho = 0;
    }

    public boolean empilhar(Pedido pedido) {

        No novoNo = new No(pedido);

        novoNo.setProximo(topo);
        topo = novoNo;
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
        No atual = topo;

        if (estaVazia()) {
            System.out.println("Não há pedidos cancelados.");
            return;
        }

        while (atual != null) {
            Pedido pedido = atual.getPedido();

            System.out.println(
                    "ID: " + pedido.getId()
                            + " - " + pedido.getPedido()
            );

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
