import java.util.ArrayList;
import java.util.List;

public class PedidoService {

    private CardapioService cardapioService;
    private ClienteService clienteService;
    private RelatorioService relatorioService;

    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public PedidoService(CardapioService cardapioService, ClienteService clienteService){
        this.cardapioService = cardapioService;
        this.clienteService = clienteService;
        this.relatorioService = relatorioService;
    }

    public List<Pedido> getPedidos(){
        return pedidos;
    }

    public void inicio() {

        int r;
        do {
            System.out.println("Menu Pedido\n\nDigite a opcao desejada:\n1 - Adicionar Pedido\n2 - Editar Pedido\n3 - Remover Pedido\n0 - Sair\n");

            r = Integer.parseInt(IO.readln("Digite a opção desejada: "));
            switch (r) {
                case 1:
                    adicionarPedido();
                    break;
            }
        } while ( r != 0);
    }

    public void adicionarPedido(){

        ArrayList<ProdutoPedido> itens = new ArrayList<>();

        relatorioService.listarCliente();

        int idCliente = Integer.parseInt(IO.readln("Qual o ID do Cliente? "));

        Cliente clienteEscolhido = null;

        for (int i = 0; i < clienteService.getClientes().size(); i++) {
            if (clienteService.getClientes().get(i).getId() == idCliente) {
                clienteEscolhido = clienteService.getClientes().get(i);
                break;
            }
        }

        relatorioService.listarCardapio();

        int r;
        double total = 0;

        do {
            int idProduto = Integer.parseInt(IO.readln("\nQual produto deseja adicionar? "));
            int quantidade = Integer.parseInt(IO.readln("Qual a quantidade?"));

            Produto produtoEscolhido = null;

            for (int i = 0; i < cardapioService.getProdutos().size(); i++) {
                if (cardapioService.getProdutos().get(i).getId() == idProduto) {
                    produtoEscolhido = cardapioService.getProdutos().get(i);
                    total += cardapioService.getProdutos().get(i).getPreco() * quantidade;
                    break;
                }
            }

            ProdutoPedido produtoPedido = new ProdutoPedido(produtoEscolhido, quantidade);

            itens.add(produtoPedido);

            r = Integer.parseInt(IO.readln("Deseja adicionar mais produtos?\n1° Sim.\n2° Não,finalizar pedido.\n"));


        } while ( r != 2);

        String status = "enviado a cozinha";

        Pedido pedido = new Pedido(clienteEscolhido, itens, status, total);

        pedidos.add(pedido);
    }
}
