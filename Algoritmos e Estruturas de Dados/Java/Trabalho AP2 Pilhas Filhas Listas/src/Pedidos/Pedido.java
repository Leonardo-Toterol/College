package Pedidos;

public class Pedido {

    private String pedido;
    private int id;
    private static int proximoID = 1;

    public Pedido(String pedido) {
        this.pedido = pedido;
        this.id = proximoID++;
    }

    public String getPedido() {
        return pedido;
    }

    public int getId() {
        return id;
    }
}
