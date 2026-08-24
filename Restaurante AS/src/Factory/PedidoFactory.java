package Factory;

import Classes.*;

import java.util.ArrayList;

public class PedidoFactory {

    public static Pedido criarPedido(
            int tipoPedido,
            Cliente cliente,
            ArrayList<ProdutoPedido> itens,
            String status,
            double total,
            Pagamento pagamento) {

        switch (tipoPedido) {
            case 1:
                return new PedidoEntrega(cliente, itens, status, total, pagamento);

            case 2:
                return new PedidoRetirada(cliente, itens, status, total, pagamento);

            case 3:
                return new PedidoLocal(cliente, itens, status, total, pagamento);

            default:
                throw new IllegalArgumentException("Tipo de pedido incorreto, tente novamente.");
        }
    }
}