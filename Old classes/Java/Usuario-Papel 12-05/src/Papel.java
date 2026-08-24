import java.util.ArrayList;

public class Papel {

    private String descricao;
    private String nome;
    private String tag;
    ArrayList<Papel> papeis;

    public Papel() {
    }

    public Papel(String descricao, String nome, String tag) {
        this.descricao = descricao;
        this.nome = nome;
        this.tag = tag;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public ArrayList<Papel> getPapeis() {
        return papeis;
    }

    public void setPapeis(ArrayList<Papel> papeis) {
        this.papeis = papeis;
    }

    @Override
    public String toString() {
        return "Papel{" +
                "descricao='" + descricao + '\'' +
                ", nome='" + nome + '\'' +
                ", tag='" + tag + '\'' +
                ", papeis=" + papeis +
                '}';
    }
}
