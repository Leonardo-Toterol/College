package Pedidos;

import java.util.Scanner;

public class MainPedidos {

    private PedidoPilha pedidoPilha;
    private PedidoFila pedidoFila;

    public MainPedidos(){
        this.pedidoFila = new PedidoFila();
        this.pedidoPilha = new PedidoPilha();
    }

    Scanner scanner = new Scanner(System.in);

    public void inicio() {

        int opcao;

        do {
            System.out.println("\n Maid Café");
            System.out.println("1 Adicionar novo pedido");
            System.out.println("2 Atender pedido");
            System.out.println("3 Cancelar pedido");
            System.out.println("4 Restaurar pedido cancleado");
            System.out.println("5 Listar pedidos pendentes");
            System.out.println("6 Listar pedidos cancelados");
            System.out.println("0 Sair");
            System.out.print("Escolha uma opção: \n");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    criarPedido();
                    break;
                case 2:
                    atenderPedido();
                    break;
                case 3:
                    cancelarPedido();
                    break;
                case 4:
                    restaurarPedido();
                    break;
                case 5:
                    pedidoFila.listar();
                    break;
                case 6:
                    pedidoPilha.listar();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção incorreta.");
            }

        } while (opcao != 0);

        scanner.close();
    }

    public void criarPedido(){

        System.out.println("Qual o nome do Cliente? ");
        String nome = scanner.nextLine();

        Pedido pedido = new Pedido(nome);

        pedidoFila.enfileirar(pedido);
    }

    public void atenderPedido(){

        Pedido pedidoAtendido = pedidoFila.desenfileirar();

        if (pedidoAtendido != null) {
            System.out.println("O pedido " + pedidoAtendido.getId() + " - " + pedidoAtendido.getPedido() + " foi atendido.");
        } else {
            System.out.println("Sem pedidos.");
        }
    }

    public void cancelarPedido() {

        Pedido pedidoRemovido = pedidoFila.desenfileirar();

        if (pedidoRemovido != null) {
            pedidoPilha.empilhar(pedidoRemovido);

            System.out.println("O pedido " + pedidoRemovido.getId() + " - " + pedidoRemovido.getPedido() + " foi cancelado");
        } else {
            System.out.println("Sem pedidos.");
        }
    }

    public void restaurarPedido() {

        Pedido pedidoCancelado = pedidoPilha.desempilhar();

        if (pedidoCancelado != null) {
            pedidoFila.enfileirar(pedidoCancelado);

            System.out.println("O pedido " + pedidoCancelado.getId() + " - " + pedidoCancelado.getPedido() + " foi restaurado.");
        } else {
            System.out.println("Sem pedido");
        }
    }

}

