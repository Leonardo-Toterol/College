package Classes;

public class ProdutoPedido {

    private Produto produto;
    private int quantidade;

    public ProdutoPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Classes.ProdutoPedido{" +
                "produto=" + produto +
                ", quantidade=" + quantidade +
                '}';
    }
}
