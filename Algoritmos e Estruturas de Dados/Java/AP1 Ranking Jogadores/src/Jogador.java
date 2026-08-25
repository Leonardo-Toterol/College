import java.io.IO;
import java.util.Arrays;

public class Jogador {

    private String nome;
    private int[] pontos;

    public Jogador(String nome, int rodadas) {
        this.nome = nome;
        this.pontos = new int[rodadas];
    }

    public void adicionarJogador(Jogador jogador){

        String nome = IO.readln("Qual o nome do jogador? ");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getPontos() {
        return pontos;
    }

    public void setPontos(int[] pontos) {
        this.pontos = pontos;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", pontos=" + Arrays.toString(pontos) +
                '}';
    }
}
