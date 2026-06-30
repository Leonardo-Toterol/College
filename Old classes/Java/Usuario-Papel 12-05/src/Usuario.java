import java.util.ArrayList;

public class Usuario {

    private String nome;
    private String username;
    private String password;
    ArrayList<Papel> papeis;

    public Usuario() {
    }

    public Usuario(String nome, String username, String password) {
        this.nome = nome;
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<Papel> getPapeis() {
        return papeis;
    }

    public void setPapeis(ArrayList<Papel> papeis) {
        this.papeis = papeis;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", papeis=" + papeis +
                '}';
    }
}
