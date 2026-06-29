public class Produto {

    int id;
    String nome;
    Double preco;
    Boolean disponivel;

    private static  int proximoId = 1;

    public Produto(String nome, Double preco, Boolean disponivel) {
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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", disponivel=" + disponivel +
                '}';
    }
}
