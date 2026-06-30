package Services;
import Classes.Pedido;
import Classes.Cliente;
import Classes.ProdutoPedido;
import Classes.Produto;

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
                    break;
                case 3:
                    listarPedido();
                    break;
                case 0:
                    break;
                default:
                    IO.println("Opção incorreta, tente novamente.");
            }
        } while ( r != 0);
    }
    
    public void listarCliente(){

        for (int i = 0; i < clienteService.getClientes().size(); i++) {
            System.out.println("Classes.Cliente " + i + " " + clienteService.getClientes().get(i));
            
        }
    }

    public void listarCardapio(){

        for (int i = 0; i < cardapioService.getProdutos().size(); i++) {
            System.out.println("Classes.Produto " + i + " " + cardapioService.getProdutos().get(i));

        }
    }

    public void listarPedido() {

        for (int i = 0; i < pedidoService.getPedidos().size(); i++) {
            Pedido pedido = pedidoService.getPedidos().get(i);

            IO.println("\n");
            IO.println("Classes.Pedido " + (i + 1));
            IO.println("Classes.Cliente: " + pedido.getCliente().getNome());
            IO.println("Status: " + pedido.getStatus());
            IO.println("Total: R$ " + pedido.getTotal());
            IO.println("Itens:\n");

            for (int j = 0; j < pedido.getItens().size(); j++) {

                ProdutoPedido item = pedido.getItens().get(j);

                IO.println("- " +
                        item.getProduto().getNome() +
                        " | Quantidade: " + item.getQuantidade() +
                        " | Valor Unitário: R$ " + item.getProduto().getPreco());
            }
        }
    }
}
