package Services;
import Classes.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteService {


    private ArrayList<Cliente> clientes = new ArrayList<>();

    public List<Cliente> getClientes(){
        return clientes;
    }


    public void inicio() {

        int r;
        do {
            IO.println("Menu Classes.Cliente\n\nDigite a opcao desejada:\n1 - Adicionar Cliente\n2 - Editar Cliente\n3 - remover Cliente\n0 - Sair\n");

            r = Integer.parseInt(IO.readln("Digite a opção desejada: "));
            switch (r) {
                case 1:
                    adicionarCliente();
                    break;
                case 2:
                    editarCliente();
                    break;
                case 3:
                    removerCliente();
                    break;
                case 0:
                    break;
                default:
                    IO.println("Opção incorreta, tente novamente;");
            }
        } while ( r != 0);
    }

    public void adicionarCliente(){

        String cpf;

        do {
            cpf = IO.readln("Qual o CPF do cliente? ");

            if (cpf.length() != 11) {
                IO.println("CPF incorreto, tente novamente.");
            }
        } while (cpf.length() != 11);

        IO.println("CPF registrado.");

        String nome = IO.readln("Qual o nome do cliente? ");
        String telefone = IO.readln("Qual o telefone do cliente? ");

        Cliente cliente = new Cliente(cpf, nome, telefone);

        clientes.add(cliente);

}

    public void editarCliente(){

        for (int i = 0; i < clientes.size(); i++) {
            IO.println("Cliente " + i + " " + clientes.get(i));

        }

        int idEscolhido = Integer.parseInt(IO.readln("Qual cliente deseja editar? "));

        Cliente clienteEscolhido = null;

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == idEscolhido) {
                clienteEscolhido = clientes.get(i);
                break;
            }
        }

            String cpf;

            do {
                cpf = IO.readln("Qual o CPF do cliente? ");

                if (cpf.length() != 11) {
                    IO.println("CPF incorreto, tente novamente.");
                }

            } while (cpf.length() != 11);


            String nome = IO.readln("Digite o novo nome: ");
            String telefone = IO.readln("Digite o novo telefone");

            clienteEscolhido.setCpf(cpf);
            clienteEscolhido.setNome(nome);
            clienteEscolhido.setTelefone(telefone);

            IO.println("Cliente editado.");

        }

    public void removerCliente(){

        for (int i = 0; i < clientes.size(); i++) {
            IO.println("Cliente " + i + " " + clientes.get(i));

        }

        int idEscolhido = Integer.parseInt(IO.readln("Qual cliente deseja remover? "));

        Cliente clienteEscolhido = null;

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == idEscolhido) {
                clienteEscolhido = clientes.get(i);
                break;
            }
        }

        clientes.remove(clienteEscolhido);

        IO.println("Cliente removido,");
    }

    }



