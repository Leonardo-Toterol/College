import java.util.ArrayList;

public class Pedido {

    Cliente cliente;
    ArrayList<ProdutoPedido> itens;
    String status;
    double total;

    public Pedido(Cliente cliente, ArrayList<ProdutoPedido> itens, String status, double total) {
        this.cliente = cliente;
        this.itens = itens;
        this.status = status;
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ProdutoPedido> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ProdutoPedido> itens) {
        this.itens = itens;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente +
                ", itens=" + itens +
                ", status='" + status + '\'' +
                ", total=" + total +
                '}';
    }
}


