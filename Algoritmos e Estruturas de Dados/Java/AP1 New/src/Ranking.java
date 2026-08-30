import java.util.Random;

public class Ranking {

    private String[] jogadores;
    private int[][] torneio;
    private int tamanho;

    public Ranking(int jogadores, int rodadas) {
        this.jogadores = new String[jogadores];
        this.torneio = new int[jogadores][rodadas];
        this.tamanho = 0;
    }

    Random random = new Random();

    public void adicionarJogador(Jogador jogador) {

        if (tamanho < jogadores.length) {
            jogadores[tamanho] = jogador.getNome();
            tamanho++;
        } else {
            System.out.println("Não há mais vagas neste torneio.");
            return;
        }
    }

    public void adicionarPontos(Jogador jogador){

        for (int i = 0; i < jogadores.length; i++) {
            if (jogadores[i].equals(jogador.getNome())){

                for (int j = 0; j < torneio[i].length; j++) {
                    torneio[i][j] = random.nextInt(100);
                }

                return;
            }
        }
    }

    public void listarRanking() {

        System.out.printf("%-12s", "");

        for (int i = 0; i < torneio[0].length; i++) {
            System.out.printf("%-3s", "R" + (i + 1));
        }

        System.out.println();

        for (int i = 0; i < tamanho; i++) {

            System.out.printf("%-12s", jogadores[i]);

            for (int j = 0; j < torneio[i].length; j++) {
                System.out.printf("%-3d", torneio[i][j]);
            }

            System.out.println();
        }
    }
}



