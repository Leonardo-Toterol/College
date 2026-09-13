import java.util.Scanner;

public class Menu {

    public void iniciar() {

        Scanner scanner = new Scanner(System.in);

        Ranking ranking = new Ranking();

        int opcao;

        do {
            System.out.println("\n-----O que deseja?----- \n1° Usar Tabela Padrão\n2° Cadastrar Manualmente\n3° Gerar Random\n4° Somar Pontuação Jogador" +
                    "\n5° Somar Pontuação Todos Jogadores\n6° Somar Pontuação Rodada\n7° Ordenar MergeSort\n8° Ordenar InsertionSort\n0 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    ranking.tabelaPadrao();
                    break;
                case 2:
                    ranking.cadastroManual(scanner);
                    break;
                case 3:
                    ranking.adicionarJogadorRandom();
                    break;
                case 4:
                    ranking.somarPontosJogador(scanner);
                    break;
                case 5:
                    ranking.somarPontos();
                    break;
                case 6:
                    ranking.somarPontosRodada(scanner);
                    break;
                case 7:
                    ranking.mergeSort();
                    break;
                case 8:
                    ranking.insertionSort();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção incorreta.");
            }
        } while (opcao != 0);

        scanner.close();

    }

    }

