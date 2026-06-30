package Classes;

import java.util.ArrayList;

public class Pedido {

    private int id;
    private Cliente cliente;
    private ArrayList<ProdutoPedido> itens;
    private String status;
    private double total;

    private static int proximoId = 1;

    public Pedido(Cliente cliente, ArrayList<ProdutoPedido> itens, String status, double total) {
        this.id = proximoId++;
        this.cliente = cliente;
        this.itens = itens;
        this.status = status;
        this.total = total;
    }

    public int getId(){
        return id;
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
        return "Classes.Pedido{" +
                "cliente=" + cliente +
                ", itens=" + itens +
                ", status='" + status + '\'' +
                ", total=" + total +
                '}';
    }
}


