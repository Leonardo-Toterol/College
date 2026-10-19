
public class PedidoFila {
    private No inicio;
    private No fim;
    private int tamanho;

    public PedidoFila() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public boolean enfileirar(Pedido pedido) {
        No novoNo = new No(pedido);

        if (estaVazia()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.setProximo(novoNo);
            fim = novoNo;
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
            System.out.println("Não há pedidos pendentes.");
            return;
        }

        No atual = inicio;

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
        return inicio == null;
    }
}
