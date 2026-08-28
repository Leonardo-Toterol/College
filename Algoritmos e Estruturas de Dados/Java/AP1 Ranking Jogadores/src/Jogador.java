import java.util.Arrays;

public class Jogador {

    private String nome;
    private int[] pontos;

    public Jogador(String nome, int rodadas) {
        this.nome = nome;
        this.pontos = new int[rodadas];
    }

    public void adicionarPontos(int rodada, int pontos){

        this.pontos[rodada] = pontos;
    }

    public int getPontos(){

        int total = 0;

        for (int ponto : pontos){
            total += ponto;
        }
        return total;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", pontos=" + Arrays.toString(pontos) +
                '}';
    }
}
