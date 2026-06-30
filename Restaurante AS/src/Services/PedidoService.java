package Services;
import Classes.*;
import Decorator.ExtraQueijo;
import Factory.PedidoFactory;
import Observer.ClienteObservador;

import java.util.ArrayList;
import java.util.List;

public class PedidoService {

    private CardapioService cardapioService;
    private ClienteService clienteService;

    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public PedidoService(CardapioService cardapioService, ClienteService clienteService) {
        this.cardapioService = cardapioService;
        this.clienteService = clienteService;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void inicio() {

        int r;
        do {
            IO.println("Menu Classes.Pedido\n\nDigite a opcao desejada:\n1 - Adicionar Pedido\n2 - Editar Pedido\n3 - Remover Pedido\n4 - Aplicar desconto\n0 - Sair\n");

            r = Integer.parseInt(IO.readln("Digite a opção desejada: "));
            switch (r) {
                case 1:
                    adicionarPedido();
                    break;
                case 2:
                    editarPedido();
                    break;
                case 3:
                    removerPedido();
                    break;
                case 4:
                    aplicarDesconto();
                    break;
                case 0:
                    break;
                default:
                    IO.println("Opção incorreta, tente novamente.");
            }
        } while (r != 0);
    }

    public void adicionarPedido() {

        ArrayList<ProdutoPedido> itens = new ArrayList<>();

        for (int i = 0; i < clienteService.getClientes().size(); i++) {
            IO.println(clienteService.getClientes().get(i));
        }

        int idCliente = Integer.parseInt(IO.readln("Qual o ID do Cliente? "));

        Cliente clienteEscolhido = null;

        for (int i = 0; i < clienteService.getClientes().size(); i++) {
            if (clienteService.getClientes().get(i).getId() == idCliente) {
                clienteEscolhido = clienteService.getClientes().get(i);
                break;
            }
        }

        int tipoPedido;

        do {
            tipoPedido = Integer.parseInt(IO.readln(
                    "\nTipo do pedido\n1 - Entrega\n2 - Retirada\n3 - Consumir no local\n"));

            if (tipoPedido < 1 || tipoPedido > 3) {
                IO.println("Opção incorreta, tente novamente.");
            }

        } while (tipoPedido < 1 || tipoPedido > 3);

        for (int i = 0; i < cardapioService.getProdutos().size(); i++) {
            IO.println(cardapioService.getProdutos().get(i));
        }

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

            int r2;

            do {
                r2 = Integer.parseInt(IO.readln("\nDeseja adicionar queijo extra?\n1 - Sim\n2 - Não\n"));

                if (r2 == 1){
                    produtoEscolhido = new ExtraQueijo(produtoEscolhido);
                }
                else if ( r2 != 2){
                    IO.println("Opção incorreta, tente novamente.");
                }
            } while (r2 != 2);

            ProdutoPedido produtoPedido = new ProdutoPedido(produtoEscolhido, quantidade);

            itens.add(produtoPedido);

            r = Integer.parseInt(IO.readln("Deseja adicionar mais produtos?\n1° Sim.\n2° Não,finalizar pedido.\n"));


        } while (r != 2);

        Pagamento pagamento = null;

        int r2;

        do {

            r2 = Integer.parseInt(IO.readln("\nForma de pagamento\n1 - PIX\n2 - Cartão\n3 - Dinheiro\n"));

            switch (r2) {
                case 1:
                    pagamento = Pagamento.PIX;
                    break;
                case 2:
                    pagamento = Pagamento.CARTAO;
                    break;
                case 3:
                    pagamento = Pagamento.DINHEIRO;
                    break;
                default:
                    IO.println("Opção incorreta, tente novamente.");

            }

        } while (pagamento == null);

        String status = "enviado a cozinha";

        Pedido pedido = PedidoFactory.criarPedido(tipoPedido, clienteEscolhido, itens, status, total, pagamento);

        pedido.adicionarObservador(new ClienteObservador());

        pedidos.add(pedido);
    }

    public void editarPedido() {

        Pedido pedidoEscolhido = pegarPedido();

        int r;

        do {

            r = Integer.parseInt(IO.readln(
                    "\nEditar Pedido\n1 - Editar Cliente\n2 - Editar Itens\n3 - Alterar Status\n0 - Sair"));

            switch (r) {
                case 1:
                    alterarCliente(pedidoEscolhido);
                    break;
                case 2:
                    editarItens(pedidoEscolhido);
                    break;
                case 3:
                    alterarStatus(pedidoEscolhido);
                    break;
                case 0:
                    break;
                default:
                    IO.println("Opção incorreta, tente novamente.");
            }
        } while (r != 0);
    }

    public void alterarCliente(Pedido pedido){

        for (int i = 0; i < clienteService.getClientes().size(); i++) {
            IO.println(clienteService.getClientes().get(i));
        }

        int idCliente = Integer.parseInt(IO.readln("Qual o novo cliente? "));

        Cliente clienteEscolhido = null;

        for (int i = 0; i < clienteService.getClientes().size(); i++) {
            if (clienteService.getClientes().get(i).getId() == idCliente) {
                clienteEscolhido = clienteService.getClientes().get(i);
                break;
            }
        }

        pedido.setCliente(clienteEscolhido);

        IO.println("Cliente alterado.");
    }

    public void editarItens(Pedido pedido) {

        int r;

        do {
            r = Integer.parseInt(IO.readln(
                    "\nEditar Itens\n1 - Adicionar Item\n2 - Remover Item\n0 - Sair"));

            switch (r) {
                case 1:
                    adicionarItem(pedido);
                    break;
                case 2:
                    removerItem(pedido);
                    break;
                case 0:
                    break;
                default:
                    IO.println("Opção incorreta, tente novamente.");
            }
        } while (r != 0);
    }

    public void alterarStatus(Pedido pedido) {

        int r;
        do {
            r = Integer.parseInt(IO.readln(
                    "\nStatus Peddio\n1 - Enviado à cozinha\n2 - Em preparação\n3 - Saiu para entrega\n4 - Entregue\n0 - Sair"));
            switch (r) {
                case 1:
                    pedido.setStatus("Enviado à cozinha");
                    break;
                case 2:
                    pedido.setStatus("Em preparo");
                    break;
                case 3:
                    pedido.setStatus("Saiu para entrega");
                    break;
                case 4:
                    pedido.setStatus("Entregue");
                    break;
                case 0:
                    break;
                default:
                    IO.println("Opção incorreta, tente novamente.");
            }
        } while (r != 0);
        IO.println("Status alterado.");
    }

    public void adicionarItem(Pedido pedido) {

        for (int i = 0; i < cardapioService.getProdutos().size(); i++) {
            IO.println(cardapioService.getProdutos().get(i));
        }

        int idProduto = Integer.parseInt(IO.readln("Qual produto deseja adicionar? "));
        int quantidade = Integer.parseInt(IO.readln("Quantidade: "));

        Produto produtoEscolhido = null;

        for (int i = 0; i < cardapioService.getProdutos().size(); i++) {
            if (cardapioService.getProdutos().get(i).getId() == idProduto) {
                produtoEscolhido = cardapioService.getProdutos().get(i);
                break;
            }
        }

        ProdutoPedido produtoPedido = new ProdutoPedido(produtoEscolhido, quantidade);

        pedido.getItens().add(produtoPedido);

        pedido.setTotal(pedido.getTotal() + (produtoEscolhido.getPreco() * quantidade));

        IO.println("Item adicionado.");
    }

    public void removerItem(Pedido pedido) {

        IO.println("Itens pedido:");

        for (int i = 0; i < pedido.getItens().size(); i++) {
            ProdutoPedido item = pedido.getItens().get(i);
            IO.println("ID: " + item.getProduto().getId() + " Produto: " + item.getProduto().getNome() + " Quantidade: " + item.getQuantidade());
        }

        int idProduto = Integer.parseInt(IO.readln("Digite o ID do produto que deseja remover: "));

        ProdutoPedido itemRemover = null;

        for (int i = 0; i < pedido.getItens().size(); i++) {

            ProdutoPedido item = pedido.getItens().get(i);

            if (item.getProduto().getId() == idProduto) {
                itemRemover = item;
                break;
            }
        }

        pedido.setTotal(pedido.getTotal() - (itemRemover.getProduto().getPreco() * itemRemover.getQuantidade()));

        pedido.getItens().remove(itemRemover);

        IO.println("Item removido com sucesso.");
    }

    public void removerPedido() {

        Pedido pedidoEscolhido = pegarPedido();

        pedidos.remove(pedidoEscolhido);

        IO.println("Pedido removido.");

    }

    public void aplicarDesconto() {

        Pedido pedidoEscolhido = pegarPedido();

        int r;

        do {
            r = Integer.parseInt(IO.readln(
                    "Descontos\n\n1 - 10%\n2 - 20%\n3 - Outro\n0 - Sair"));

            switch (r) {
                case 1:
                    pedidoEscolhido.setTotal(pedidoEscolhido.getTotal() * 0.90);
                    IO.println("Adicionado 10% de desconto.");
                    break;
                case 2:
                    pedidoEscolhido.setTotal(pedidoEscolhido.getTotal() * 0.80);
                    IO.println("Adicionado 20% de desconto");
                    break;
                case 3:
                    double valor = Double.parseDouble(IO.readln("Digite a % de desconto: "));

                    if (valor < 0 || valor > 100){
                        IO.println("Valor inválido, tente novamente.");
                    } else {
                        pedidoEscolhido.setTotal(pedidoEscolhido.getTotal() * (1 - valor / 100));
                        IO.println("Desconto de " + valor + "% adicionado.");
                    }
                    break;
                case 0:
                    break;
                default:
                    IO.println("Opção incorreta, tente novamente.");
            }

        } while (r != 0);
    }

    private Pedido pegarPedido(){
        for (int i = 0; i < pedidos.size(); i++) {
            IO.println(pedidos.get(i));
        }

        int idPedido = Integer.parseInt(IO.readln("Qual pedido deseja aplicar desconto? "));

        Pedido pedidoEscolhido = null;

        for (int i = 0; i < pedidos.size(); i++) {
            if (pedidos.get(i).getId() == idPedido){
                pedidoEscolhido = pedidos.get(i);
                break;
            }
        }
        return pedidoEscolhido;
    }
}

