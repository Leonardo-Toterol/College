import java.util.ArrayList;

public class Contato {

    private String nome;
    private String email;
    private ArrayList<Telefone> numeros = new ArrayList<>();

    public Contato() {
    }

    public Contato(String email, String nome) {
        this.email = email;
        this.nome = nome;
    }

    public Contato(String nome, String email, ArrayList<Telefone> numeros) {
        this.nome = nome;
        this.email = email;
        this.numeros = numeros;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Telefone> getNumeros() {
        return numeros;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumeros(ArrayList<Telefone> numeros) {
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", numeros=" + numeros +
                '}';
    }
}
