public class Ranking {

    private Jogador[] jogadores;
    private int tamanho;

    public Ranking(int jogadores) {
        this.jogadores = new Jogador[jogadores];
        this.tamanho = 0;
    }

    public void adicionarJogador(Jogador jogador){

        for (int i = 0; i < jogadores.length; i++) {
            if (jogadores[i] == null){
                jogadores[i] = jogador;
                tamanho++;
                return;
            }
        }
    }

    public void somarPontos(Jogador jogador){

        int total = 0;

        for (int i = 0; i < jogadores.length; i++) {

            total += jogadores[i].getPontos();
        }

        System.out.println("O total de pontos de " + jogador.getNome() + "é : " + total);
    }

    public void teste(){

        for (int i = 0; i < jogadores.length; i++) {
            System.out.println(jogadores[i]);
        }
    }

}
