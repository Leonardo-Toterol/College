import java.util.ArrayList;
import java.util.List;

public class CardapioService {

    ArrayList<Produto> produtos = new ArrayList<>();

    public List<Produto> getProdutos(){
        return produtos;
    }

    public void inicio() {

        int r;
        do {
            System.out.println("Menu Cardápio\n\nDigite a opcao desejada:\n1 - Adicionar Produto\n2 - Editar Produto\n3 - Remover Produto\n0 - Sair\n");

            r = Integer.parseInt(IO.readln("Digite a opção desejada: "));
            switch (r) {
                case 1:
                    adicionarProduto();
                    break;
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
}
