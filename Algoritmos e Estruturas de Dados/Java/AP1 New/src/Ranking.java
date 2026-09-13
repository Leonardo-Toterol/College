import java.util.Random;
import java.util.Scanner;

public class Ranking {

    private Jogador[] jogadores;
    private int[][] torneio;
    private int tamanho;

    public Ranking(int jogadores, int rodadas) {
        this.jogadores = new Jogador[jogadores];
        this.torneio = new int[jogadores][rodadas];
        this.tamanho = 0;
    }

    public Ranking() {
        this.jogadores = new Jogador[5];
        this.torneio = new int[5][4];
        this.tamanho = 0;
    }

    Random random = new Random();

    public void adicionarJogadorRandom() {

        this.jogadores = new Jogador[5];
        this.torneio = new int[5][4];
        this.tamanho = 0;

        Jogador[] jogadoresList = {new Jogador("Leonardo"), new Jogador("Ramon"), new Jogador("Rafael"),
                new Jogador("Pedro"), new Jogador("Jorge"), new Jogador("Julio"), new Jogador("Matheus")};

        boolean yes;

        for (int i = 0; i < 5; i++) {

            int indice = random.nextInt(jogadoresList.length);

            do {
                yes = false;

                for (int j = 0; j < i; j++) {

                    if (jogadores[j] == jogadoresList[indice]) {
                        yes = true;
                        break;
                    }
                }

                if (yes) {
                    indice = random.nextInt(jogadoresList.length);
                }

            } while (yes);

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

        this.jogadores = new Jogador[] {new Jogador("Jogador 1"), new Jogador("Jogador 2"), new Jogador("Jogador 3"), new Jogador("Jogador 4"), new Jogador("Jogador 5")};
        this.torneio = new int[][] {{80, 90, 70, 85}, {70, 75, 80, 90}, {95, 90, 85, 95}, {60, 80, 70, 75}, {85, 80, 90, 80}};

        this.tamanho = 5;

        listarTorneio();
        }

    public void cadastroManual(Scanner scanner){

        System.out.println("----ATENÇÃO----");
        System.out.println("Primeiro deve-se gerar o torneio, depois os jogadores e por último a pontuação");
        System.out.println("Também não fiz tratamentos de erros, selecione os índices corretamente por favor :)");
        System.out.println();

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
                case 0:
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

        this.jogadores = new Jogador[jogadores];
        this.torneio = new int[jogadores][rodadas];
        this.tamanho = 0;

    }

    public void listarJogadores(){

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Jogador " + (i + 1) + " -" + jogadores[i].getNome());
        }

    }

    public void listarTorneio(){

        System.out.printf("%-12s", "");

        for (int i = 0; i < torneio[0].length; i++) {
            System.out.printf("%-3s", "R" + (i + 1));
        }

        System.out.println();

        for (int i = 0; i < tamanho; i++) {

            System.out.printf("%-12s", jogadores[i].getNome());

            for (int j = 0; j < torneio[i].length; j++) {
                System.out.printf("%-3d", torneio[i][j]);
            }

            System.out.println();
        }
    }

    public void adicionarPontos(Scanner scanner){

        this.listarJogadores();
        System.out.println();

        System.out.println("Qual o indice do jogador que deseja adicionar os pontos? ");
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
            jogadores[tamanho] = jogador;
            tamanho++;
        }
        else{
            System.out.println("Não há mais vagas no torneio.");
        }
    }

    public void somarPontos(){
        System.out.println();

        for (int i = 0; i < jogadores.length; i++) {
            int total = 0;
            for (int j = 0; j < torneio[i].length; j++) {
                total += torneio[i][j];
            }
            System.out.printf("Jogador: %-10s - Pontuação Final = %d%n", jogadores[i].getNome(), total);

        }
    }

    public void somarPontosJogador(Scanner scanner){

        listarJogadores();
        System.out.println();

        System.out.println("Qual o indice do Jogador que deseja somar os pontos? ");
        int indice = scanner.nextInt();

        for (int i = 0; i < jogadores.length; i++) {
            int total = 0;
            if (i == indice){
                for (int j = 0; j < torneio[i].length; j++) {
                total += torneio[i][j];
            }
            System.out.println("Jogador: " + jogadores[i].getNome() + " - Pontuação Final = " + total);
        }
        }
    }

    public void somarPontosRodada(Scanner scanner){

        System.out.println("Qual rodada deseja somar? ");
        int rodada = scanner.nextInt();

        int total = 0;


        for (int i = 0; i < tamanho; i++) {
            total += torneio[i][rodada-1];
        }

        System.out.println("Pontuação total da rodada " + (rodada + 1) + ": " + total);

    }

    public void mergeSort() {

        int[] pontuacoes = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < torneio[i].length; j++) {
                pontuacoes[i] += torneio[i][j];
            }
        }

        mergeSort2(0, tamanho - 1, pontuacoes);


        System.out.println("\n Ranking ordenado com Merge Sort ");

        for (int i = 0; i < tamanho; i++) {
            System.out.printf(
                    "%dº - %-12s %d pontos%n",
                    i + 1,
                    jogadores[i].getNome(),
                    pontuacoes[i]
            );
        }
    }

    private void mergeSort2(int inicio, int fim, int[] pontuacoes) {

        if (inicio < fim) {

            int meio = (inicio + fim) / 2;

            mergeSort2(inicio, meio, pontuacoes);

            mergeSort2(meio + 1, fim, pontuacoes);

            merge(inicio, meio, fim, pontuacoes);
        }
    }

    private void merge(int inicio, int meio, int fim, int[] pontuacoes) {

        Jogador[] jogadoresTemp = new Jogador[fim - inicio + 1];
        int[] pontuacoesTemp = new int[fim - inicio + 1];

        int i = inicio;
        int j = meio + 1;
        int k = 0;

        while (i <= meio && j <= fim) {

            if (pontuacoes[i] > pontuacoes[j]) {

                jogadoresTemp[k] = jogadores[i];
                pontuacoesTemp[k] = pontuacoes[i];

                i++;

            } else {

                jogadoresTemp[k] = jogadores[j];
                pontuacoesTemp[k] = pontuacoes[j];

                j++;
            }

            k++;
        }

        while (i <= meio) {

            jogadoresTemp[k] = jogadores[i];
            pontuacoesTemp[k] = pontuacoes[i];

            i++;
            k++;
        }

        while (j <= fim) {

            jogadoresTemp[k] = jogadores[j];
            pontuacoesTemp[k] = pontuacoes[j];

            j++;
            k++;
        }

        for (int x = 0; x < jogadoresTemp.length; x++) {

            jogadores[inicio + x] = jogadoresTemp[x];
            pontuacoes[inicio + x] = pontuacoesTemp[x];
        }
    }

    public void insertionSort() {

        int[] pontuacoes = new int[tamanho];

        // Calcula a pontuação total de cada jogador
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < torneio[i].length; j++) {
                pontuacoes[i] += torneio[i][j];
            }
        }

        // Insertion Sort
        for (int i = 1; i < tamanho; i++) {

            Jogador jogadorAtual = jogadores[i];
            int pontuacaoAtual = pontuacoes[i];

            int j = i - 1;

            while (j >= 0 && pontuacoes[j] < pontuacaoAtual) {

                jogadores[j + 1] = jogadores[j];
                pontuacoes[j + 1] = pontuacoes[j];

                j--;
            }

            jogadores[j + 1] = jogadorAtual;
            pontuacoes[j + 1] = pontuacaoAtual;
        }

        // Exibe o ranking
        System.out.println("\nRanking ordenado com Insertion Sort");

        for (int i = 0; i < tamanho; i++) {
            System.out.printf(
                    "%dº - %-12s %d pontos%n",
                    i + 1,
                    jogadores[i].getNome(),
                    pontuacoes[i]
            );
        }
    }
}



