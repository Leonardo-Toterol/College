package Services;
import Classes.Produto;

import java.util.ArrayList;
import java.util.List;

public class CardapioService {

    private ArrayList<Produto> produtos = new ArrayList<>();

    public List<Produto> getProdutos(){
        return produtos;
    }

    public void inicio() {

        int r;
        do {
            IO.println("Menu Cardápio\n\nDigite a opcao desejada:\n1 - Adicionar Produto\n2 - Editar Produto\n3 - Remover Produto\n0 - Sair\n");

            r = Integer.parseInt(IO.readln("Digite a opção desejada: "));
            switch (r) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    editarProduto();
                    break;
                case 3:
                    removerProduto();
                    break;
                case 0:
                    break;
                default:
                    IO.println("Opção incorreta, tente novamente.");
            }
        } while ( r != 0);
    }

    public void adicionarProduto(){

        String nome = IO.readln("Qual o nome do produto? ");
        double preco = Double.parseDouble(IO.readln("Qual o valor do produto? "));

        boolean disponivel = false;
        int r;

        do {
            r = Integer.parseInt(IO.readln("Está disponível? \n\n 1° Sim\n2° Não"));

            if (r == 1) {
                disponivel = true;
            }
            else if (r == 2) {
                disponivel = false;
            }
            else {
                IO.println("Opção incorreta, tente novamente.");
            }
        } while (r != 1 && r != 2);

        Produto produto = new Produto(nome, preco, disponivel);
        produtos.add(produto);
    }

    public void editarProduto(){

        for (int i = 0; i < produtos.size(); i++) {
            IO.println(produtos.get(i));
        }

        int idEscolhido = Integer.parseInt(IO.readln("Qual produto deseja editar? "));

        Produto produtoEscolhido = null;

        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getId() == idEscolhido) {
                produtoEscolhido = produtos.get(i);
                break;
            }
        }

        String nome = IO.readln("Digite o novo nome: ");
        double preco = Double.parseDouble(IO.readln("Digite o novo preço: "));

        boolean disponivel = false;

        int r;

        do {
            r = Integer.parseInt(IO.readln("Está disponível?\n1 - Sim\n2 - Não"));

            if (r == 1) {
                disponivel = true;
            } else if (r == 2) {
                disponivel = false;
            } else {
                IO.println("Opção incorreta, tente novamente.");
            }

        } while (r != 1 && r != 2);

        produtoEscolhido.setNome(nome);
        produtoEscolhido.setPreco(preco);
        produtoEscolhido.setDisponivel(disponivel);

        IO.println("Produto editado.");
    }

    public void removerProduto(){

        for (int i = 0; i < produtos.size(); i++) {
            IO.println(produtos.get(i));
        }

        int idEscolhido = Integer.parseInt(IO.readln("Qual produto deseja remover? "));

        Produto produtoEscolhido = null;

        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getId() == idEscolhido) {
                produtoEscolhido = produtos.get(i);
                break;
            }
        }

        produtos.remove(produtoEscolhido);

        IO.println("Produto removido.");
    }
}


