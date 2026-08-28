import java.util.Random;

public class Main {

    public static void main(String[] args){


        Jogador jogador = new Jogador("Lucas", 4);
        Jogador jogador2 = new Jogador("Leonardo", 4);
        Jogador jogador3 = new Jogador("Rafael", 4);

        Ranking ranking = new Ranking(3);
        Random random = new Random();

        ranking.adicionarJogador(jogador);
        ranking.adicionarJogador(jogador2);
        ranking.adicionarJogador(jogador3);

        for (int i = 0; i < 4; i++) {
            jogador.adicionarPontos(i, random.nextInt(50));
            jogador2.adicionarPontos(i, random.nextInt(50));
            jogador3.adicionarPontos(i, random.nextInt(50));
        }

        ranking.teste();
        System.out.println();

        System.out.println(jogador.getPontos());

//        ranking.somarPontos(jogador);
//        ranking.somarPontos(jogador2);
//        ranking.somarPontos(jogador3);

    }
}

