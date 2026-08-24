import java.time.LocalDateTime;
import java.util.ArrayList;

public class Cliente {

    private String nome;
    private String cpf;
    private String DataNascimento;
    ArrayList<Endereco> enderecos = new ArrayList<>();


    public Cliente() {
    }

    public Cliente(String nome, String cpf, String dataNascimento, ArrayList<Endereco> enderecos) {
        this.enderecos = enderecos;
        DataNascimento = dataNascimento;
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setDataNascimento(String dataNascimento) {
        DataNascimento = dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEnderecos(ArrayList<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", DataNascimento='" + DataNascimento + '\'' +
                ", enderecos=" + enderecos.toString() +
                '}';
    }
}

