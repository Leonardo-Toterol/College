package Classes;
import Observer.Observador;
import Classes.Pedido;

public class Cliente implements Observador {

    private int id;
    private String cpf;
    private String nome;
    private String telefone;

    private static  int proximoId = 0;

    public Cliente(String cpf, String nome, String telefone) {
        this.id = proximoId;
        proximoId++;
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Classes.Cliente{" +
                "id=" + id +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    @Override
    public void atualizar(Pedido pedido){
        IO.println("\nAviso para " + nome + "Seu pedido foi atualizado para " + pedido.getStatus());
        IO.println("\n");
    }
}
