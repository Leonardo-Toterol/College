package Services;

public class RestauranteService {

    private ClienteService clienteService = new ClienteService();
    private CardapioService cardapioService = new CardapioService();
    private PedidoService pedidoService = new PedidoService(cardapioService, clienteService);
    private RelatorioService relatorioService = new RelatorioService(clienteService, cardapioService, pedidoService);


    public void inicio()
            {

        int r;
        do {
            IO.println("Dom Juan's\n\nDigite a opcao desejada:\n1 - Menu Clientes\n2 - Menu Cardápio\n3 - Menu Pedido\n4 - Relatórios\n0 - Sair\n");

            r = Integer.parseInt(IO.readln("Digite a opção desejada: "));
            switch (r) {
                case 1:
                    this.clienteService.inicio();
                    break;
                case 2:
                    this.cardapioService.inicio();
                    break;
                case 3:
                    this.pedidoService.inicio();
                    break;
                case 4:
                    this.relatorioService.inicio();
                    break;
                case 0:
                    break;
                default:
                    IO.println("Opção incorreta, tente novamente.");
                    break;
            }
        } while (r != 0);
    }
}
