public class Usuario {

    private String nome;
    private int idade;
    private boolean ativo;

    public Usuario() {
    }

    public Usuario(String nome, int idade, boolean ativo) {
        this.nome = nome;
        this.idade = idade;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", ativo=" + ativo +
                '}';
    }
}
