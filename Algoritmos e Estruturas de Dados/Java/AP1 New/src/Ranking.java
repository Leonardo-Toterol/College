import java.util.Random;
import java.util.Scanner;

public class Ranking {

    private String[] jogadores;
    private int[][] torneio;
    private int tamanho;

    public Ranking(int jogadores, int rodadas) {
        this.jogadores = new String[jogadores];
        this.torneio = new int[jogadores][rodadas];
        this.tamanho = 0;
    }

    public Ranking() {
        this.jogadores = new String[5];
        this.torneio = new int[5][4];
        this.tamanho = 0;
    }

    Random random = new Random();

    public void adicionarJogadorRandom() {

        this.jogadores = new String[5];
        this.torneio = new int[5][4];
        this.tamanho = 0;

        String[] jogadoresList = {"Leonardo", "Lucas", "Rafael", "Ramon", "Juliano", "Jorge", "Fabricio", "Pedro"};

        for (int i = 0; i < 5; i++) {
            int indice = random.nextInt(jogadoresList.length);
            jogadores[i] = jogadoresList[indice];
            }
        tamanho = 5;
        adicionarPontosRandom();
        listarTorneio();
        }

    public void adicionarPontosRandom(){

        for (int i = 0; i < jogadores.length; i++) {
            for (int j = 0; j < torneio[i].length; j++) {
                torneio[i][j] = random.nextInt(100);
            }
            }
        return;
        }

    public void tabelaPadrao() {

        String[] jogadoresPadrao = {"Jogador 1", "Jogador 2", "Jogador 3", "Jogador 4", "Jogador 5"};
        int[][] torneioPadrao = {{80, 90, 70, 85}, {70, 75, 80, 90}, {95, 90, 85, 95}, {60, 80, 70, 75}, {85, 80, 90, 80}};

        System.out.printf("%-12s", "");

        for (int i = 0; i < 4; i++) {
            System.out.printf("%-3s", "R" + (i + 1));
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {

            System.out.printf("%-12s", jogadoresPadrao[i]);

            for (int j = 0; j < 4; j++) {
                System.out.printf("%-3d", torneioPadrao[i][j]);
            }

            System.out.println();
        }
    }

    public void cadastroManual(Scanner scanner){

        int opcao;

        do {
            System.out.println("\n-----O que deseja?----- \n1° Cadastrar jogador\n2° Criar torneio\n3° Adicionar pontos\n4° Listar Jogadores\n5° Listar Torneio\n0 Voltar");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarJogador(scanner);
                    break;
                case 2:
                    criarTorneio(scanner);
                    break;
                case 3:
                    adicionarPontos(scanner);
                    break;
                case 4:
                    listarJogadores();
                    break;
                case 5:
                    listarTorneio();
                    break;
                default:
                    System.out.println("Opção incorreta.");
            }
        } while (opcao != 0);

    }

    public void cadastrarJogador(Scanner scanner){


        System.out.println("Qual o nome do jogador? ");
        String nome = scanner.nextLine();

        Jogador jogador = new Jogador(nome);

        adicionarJogador(jogador);

    }

    public void criarTorneio(Scanner scanner){

        System.out.println("Quantos jogadores o torneio terá? ");
        int jogadores = scanner.nextInt();

        System.out.println("Quantas rodadas o torneio terá? ");
        int rodadas = scanner.nextInt();

        this.jogadores = new String[jogadores];
        this.torneio = new int[jogadores][rodadas];
        this.tamanho = 0;

    }

    public void listarJogadores(){

        for (int i = 0; i < jogadores.length; i++) {
            System.out.println("Jogador: " + jogadores[i]);
        }

    }

    public void listarTorneio(){

        System.out.printf("%-12s", "");

        for (int i = 0; i < torneio[0].length; i++) {
            System.out.printf("%-3s", "R" + (i + 1));
        }

        System.out.println();

        for (int i = 0; i < torneio.length; i++) {

            System.out.printf("%-12s", jogadores[i]);

            for (int j = 0; j < torneio[i].length; j++) {
                System.out.printf("%-3d", torneio[i][j]);
            }

            System.out.println();
        }
    }

    public void adicionarPontos(Scanner scanner){

        this.listarJogadores();
        System.out.println();

        System.out.println("Qual o indice do jogador que deseja adicionar os pontos?");
        int indice = scanner.nextInt();

        int tamanhoTorneio = torneio[0].length;

        System.out.println("Este torneio possui: " + tamanhoTorneio + " rodadas.");

        for (int i = 0; i < torneio.length; i++) {
            if (i == indice){
                for (int j = 0; j < torneio[i].length; j++) {
                        System.out.println("Quantos pontos deseja adicionar na rodada " + (j + 1));
                        int pontos = scanner.nextInt();
                        torneio[i][j] = pontos;
                }
            }
        }
    }

    public void adicionarJogador(Jogador jogador){

        if (tamanho < jogadores.length) {
            jogadores[tamanho] = jogador.getNome();
            tamanho++;
        }
        else{
            System.out.println("Não há mais vagas no torneio.");
        }
    }
}



