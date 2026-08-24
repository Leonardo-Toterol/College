package Classes;

import java.util.ArrayList;
import Observer.Observador;

public class Pedido {

    private int id;
    private Cliente cliente;
    private ArrayList<ProdutoPedido> itens;
    private String status;
    private double total;
    private Pagamento pagamento;

    private static int proximoId = 0;

    private ArrayList<Observador> observadores = new ArrayList<>();

    public Pedido(Cliente cliente, ArrayList<ProdutoPedido> itens, String status, double total, Pagamento pagamento) {
        this.id = proximoId++;
        this.cliente = cliente;
        this.itens = itens;
        this.status = status;
        this.total = total;
        this.pagamento = pagamento;
    }

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(this);
        }
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
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
        notificarObservadores();
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
                "id= " + id +
                "cliente=" + cliente +
                ", itens=" + itens +
                ", status='" + status + '\'' +
                ", total=" + total +
                '}';
    }
}


