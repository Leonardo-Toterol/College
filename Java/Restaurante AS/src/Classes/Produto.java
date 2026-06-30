package Classes;

public class Produto {

    private int id;
    private String nome;
    private double preco;
    private boolean disponivel;

    private static  int proximoId = 1;

    public Produto(String nome, double preco, boolean disponivel) {
        this.id = proximoId;
        proximoId++;
        this.nome = nome;
        this.preco = preco;
        this.disponivel = disponivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public static int getProximoId() {
        return proximoId;
    }

    public static void setProximoId(int proximoId) {
        Produto.proximoId = proximoId;
    }

    @Override
    public String toString() {
        return "Classes.Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", disponivel=" + disponivel +
                '}';
    }
}
