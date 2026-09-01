import java.util.Scanner;

public class Menu {

    public void iniciar() {

        Scanner scanner = new Scanner(System.in);

        Ranking ranking = new Ranking();

        int opcao;

        do {
            System.out.println("\n-----O que deseja?----- \n1° Usar Tabela Padrão\n2° Cadastrar Manualmente\n3° Gerar Random\n0 - Sair");

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
                default:
                    System.out.println("Opção incorreta.");
            }
        } while (opcao != 0);

        scanner.close();

    }



    }

