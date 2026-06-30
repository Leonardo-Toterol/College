import java.util.ArrayList;


void main() {

    ArrayList<Cliente> clientes = new ArrayList<>();
    menu(clientes);


}
    public void adicionarCliente (ArrayList < Cliente > clientes) {
        String nome = IO.readln("Digite o nome do cliente: ");
        String cpf = IO.readln("Digite o cpf: ");
        double saldo = 0;

        Cliente cliente = new Cliente(nome, cpf, saldo);

        clientes.add(cliente);
        System.out.println("Cliente salvo com sucesso");
    }

    public void listarClientes(ArrayList <Cliente> clientes){
        for (int i = 0; i < clientes.size() ; i++) {
            IO.println(clientes.get(i));

        }
        }

    public void removerCliente(ArrayList <Cliente> clientes) {
        String cpf = IO.readln("Informe o cpf: ");

        boolean encontrouCliente = false;

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).cpf.equals(cpf)) {
                clientes.remove(i);
                encontrouCliente = true;
            }
        }

        if (!encontrouCliente) {
            System.out.println("Cliente não encontrado.");
        } else {
            System.out.println("Cliente encontrado.");
        }
    }

    public void editarCliente(ArrayList <Cliente> clientes){
        int r = Integer.parseInt(IO.readln("O que deseja editar?\n1° Nome\n2° CPF\n: "));

        if(r == 1){
            String nome = IO.readln("Digite o nome que deseja atualizar: ");

            for (int i = 0; i < clientes.size(); i++) {
                if(clientes.get(i).nome.equals(nome)){
                    String nome2 = IO.readln("Digite o nome correto: ");
                    clientes.get(i).nome = nome2;
                }

            }
        }
        else if(r == 2){
            String cpf = IO.readln("Digite o CPF que deseja atualizar: ");

            for (int i = 0; i < clientes.size(); i++) {
                if(clientes.get(i).cpf.equals(cpf)){
                    String cpf2 = IO.readln("Digite o cpf correto: ");
                    clientes.get(i).cpf = cpf2;
                }

            }
        }
        else{
            IO.println("Opção incorreta.");
        }

    }

    public int menu(ArrayList <Cliente> clientes){
            int r;

            do{
                IO.println("\nBanco de Dados\n1° Adicionar Cliente\n2° Remover Cliente\n3° Editar Cliente\n4° Listar Clientes\n5° Sair\n");
                r = Integer.parseInt(IO.readln());

                switch(r){
                    case 1:
                        adicionarCliente(clientes);
                        break;

                    case 2:
                        removerCliente(clientes);
                        break;

                    case 3:
                        editarCliente(clientes);
                        break;

                    case 4:
                        listarClientes(clientes);
                        break;

                    case 5:
                        IO.println("Encerrando...");
                        break;

                }
            }while(r != 5);
                return r;
        }
