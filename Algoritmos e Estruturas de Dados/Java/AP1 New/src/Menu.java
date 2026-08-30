import java.util.Scanner;

public class Menu {

    public void iniciar() {

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n-----O que deseja?----- \n1° Usar Tabela Padrão\n2° Cadastrar Manualmente\n3° Gerar Random\n");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    tabelaPadrao();
                    break;
                case 2:
                    cadastroManual();
                    break;

                default:
                    System.out.println("Opção incorreta.");
            }
        } while (opcao != 0);

        scanner.close();

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

    public void cadastroManual(){

    }
}
