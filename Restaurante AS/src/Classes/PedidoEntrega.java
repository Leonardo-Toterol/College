package Classes;

import java.util.ArrayList;

public class PedidoEntrega extends Pedido {

    public PedidoEntrega(Cliente cliente, ArrayList<ProdutoPedido> itens, String status, double total, Pagamento pagamento) {
        super(cliente, itens, status, total, pagamento);
    }
}