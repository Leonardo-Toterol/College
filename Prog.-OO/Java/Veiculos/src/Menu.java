import java.util.ArrayList;

public class Menu {
    private ArrayList<Veiculos> veiculos = new ArrayList<>();

    public void iniciar() {

        int r;
        do {
            r = Integer.parseInt(IO.readln("\nMenu\n1°Adicionar Veículo\n2° Editar Veículo\n3° Remover Veículo\n4° Listar Veículos\n0 Sair\n\nDigite a opção: "));

            switch (r) {
                case 1:
                    this.adicionar();
                    break;
            }
        } while (r != 0);
    }

    public void adicionar() {

        int r = Integer.parseInt(IO.readln("O que deseja adicionar?\n1° Carro\n2° Moto\n"));

        if (r == 1) {
            String nome = IO.readln("Digite o nome: ");
            String modelo = IO.readln("Digite o modelo: ");
            int ano = Integer.parseInt(IO.readln("Digite o ano: "));
            int portas = Integer.parseInt(IO.readln("Quantas portas? "));

            Carro carro = new Carro(nome, modelo, ano, portas);

            veiculos.add(carro);
        }
    }
}