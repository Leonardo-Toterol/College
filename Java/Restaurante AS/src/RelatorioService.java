public class RelatorioService {

    private ClienteService clienteService;
    private CardapioService cardapioService;
    private PedidoService pedidoService;

    public RelatorioService(ClienteService clienteService, CardapioService cardapioService,PedidoService pedidoService){
        this.clienteService = clienteService;
        this.cardapioService = cardapioService;
        this.pedidoService = pedidoService;
    }

    public ClienteService getClienteService() {
        return clienteService;
    }

    public CardapioService getCardapioService() {
        return cardapioService;
    }

    public PedidoService getPedidoService() {
        return pedidoService;
    }

    public void inicio() {

        int r;
        do {
            System.out.println("Menu Relatorio\n\nDigite a opcao desejada:\n1 - Listar Clientes\n2 - Listar Cardapio\n3 - Listar Pedidos\n0 - Sair\n");

            r = Integer.parseInt(IO.readln("Digite a opção desejada: "));
            switch (r) {
                case 1:
                    listarCliente();
                    break;
                case 2:
                    listarCardapio();
            }
        } while ( r != 0);
    }
    
    public void listarCliente(){

        for (int i = 0; i < clienteService.getClientes().size(); i++) {
            System.out.println("Cliente " + i + " " + clienteService.getClientes().get(i));
            
        }
    }

    public void listarCardapio(){

        for (int i = 0; i < cardapioService.getProdutos().size(); i++) {
            System.out.println("Produto " + i + " " + cardapioService.getProdutos().get(i));

        }
    }
}
