package Musica;

import java.util.Scanner;

public class Main {

    private Scanner scanner;
    private ListaDupla listaDupla;

    public Main() {

        this.scanner = new Scanner(System.in);
        this.listaDupla = new ListaDupla();
    }

    public void iniciar() {
        int opcao;

        do {
            System.out.println("\n Maid Musicas");
            System.out.println("1 Próxima música");
            System.out.println("2 Música anterior");
            System.out.println("3 Ordenar playlist");
            System.out.println("4 Tocar música atual");
            System.out.println("5 Adicionar música");
            System.out.println("6 Remover música");
            System.out.println("7 Listar músicas");
            System.out.println("0 Sair");
            System.out.print("Escolha uma opção: ");

            opcao = lerInteiro();

            switch (opcao) {
                case 1:
                    proximaMusica();
                    break;
                case 2:
                    musicaAnterior();
                    break;
                case 3:
                    ordenarPlaylist();
                    break;
                case 4:
                    tocarMusica();
                    break;
                case 5:
                    adicionarMusica();
                    break;
                case 6:
                    removerMusica();
                    break;
                case 7:
                    listaDupla.listar();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção incorreta");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }

    private void proximaMusica() {
        if (listaDupla.proximaMusica()) {
            tocarMusica();
        } else {
            System.out.println("Não tem.");
        }
    }

    private void musicaAnterior() {
        if (listaDupla.musicaAnterior()) {
            tocarMusica();
        } else {
            System.out.println("Não tem.");
        }
    }

    private void ordenarPlaylist() {
        System.out.println("nao deu tempo ;-;");
    }

    private void tocarMusica() {

        Musica musica = listaDupla.getMusicaAtual();

        if (musica == null) {
            System.out.println("Não tem musica.");
            return;
        }

        System.out.println("\ntocando");
        System.out.println(musica);
    }

    private void adicionarMusica() {

        System.out.print("Qual o titulo? ");
        String titulo = scanner.nextLine();

        System.out.print("Qual o artista? ");
        String artista = scanner.nextLine();

        System.out.print("Qual o álbum? ");
        String album = scanner.nextLine();

        System.out.print("Qual a duração em segundos?");
        int duracao = lerInteiro();

        Musica musica = new Musica(titulo, artista, album, duracao);

        System.out.println("\nOnde deseja adicionar?");
        System.out.println("1 No início");
        System.out.println("2 No fim");
        System.out.println("3 Em uma posição específica");
        System.out.print("Escolha uma opção: ");

        int opcao = lerInteiro();

        switch (opcao) {
            case 1:
                listaDupla.adicionarInicio(musica);
                break;
            case 2:
                listaDupla.adicionarFim(musica);
                break;
            case 3:
                int posicao = lerInteiro();

                if (listaDupla.adicionarNaPosicao(posicao, musica)) {
                    System.out.println("Música adicionada na posição " + posicao);
                } else {
                    System.out.println("Posição incorreta.");
                }
                break;
            default:
                System.out.println("Opção incorreta.");
                break;
        }
    }

    private void removerMusica() {
        System.out.println("\nREMOVER MÚSICA");
        System.out.println("1 Por título");
        System.out.println("2 Por posição");
        System.out.print("Escolha: ");

        int opcao = lerInteiro();

        switch (opcao) {
            case 1:
                System.out.print("Qual o titulo? ");
                String titulo = scanner.nextLine();

                if (listaDupla.removerPorTitulo(titulo)) {
                } else {
                    System.out.println("Música não encontrada.");
                }
                break;
            case 2:
                listaDupla.listar();
                System.out.print("Posição da música para remover: ");
                int posicao = lerInteiro();

                if (listaDupla.removerNaPosicao(posicao)) {
                } else {
                    System.out.println("Posição incorreta.");
                }
                break;
            default:
                System.out.println("Opção incorrreta.");
                break;
        }
    }

    private int lerInteiro() {
        while (true) {
            String entrada = scanner.nextLine();

            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.print("Digite um número inteiro: ");
            }
        }
    }

    public static void main(String[] args) {
        Main programa = new Main();
        programa.iniciar();
    }
}
