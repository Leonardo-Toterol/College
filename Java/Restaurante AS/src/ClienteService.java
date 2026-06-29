import java.util.ArrayList;
import java.util.List;

public class ClienteService {

    ArrayList<Cliente> clientes = new ArrayList<>();

    public List<Cliente> getClientes(){
        return clientes;
    }

    public void inicio() {

        int r;
        do {
            System.out.println("Menu Cliente\n\nDigite a opcao desejada:\n1 - Adicionar Cliente\n2 - Editar Cliente\n3 - Remover Cliente\n0 - Sair\n");

            r = Integer.parseInt(IO.readln("Digite a opção desejada: "));
            switch (r) {
                case 1:
                    adicionarCliente();
                    break;
            }
        } while ( r != 0);
    }

    public void adicionarCliente(){

        String cpf;

        do {
            cpf = IO.readln("Qual o CPF do cliente? ");

            if (cpf.length() != 11) {
                IO.println("CPF inválido, tente novamente.");
            }

        } while (cpf.length() != 11);

        IO.println("CPF registrado.");

        String nome = IO.readln("Qual o nome do cliente? ");
        String telefone = IO.readln("Qual o telefone do cliente? ");

        Cliente cliente = new Cliente(cpf, nome, telefone);

        clientes.add(cliente);

}

    public void

