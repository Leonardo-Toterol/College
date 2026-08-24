import java.util.ArrayList;

public class Menu {
    public void inicio(){
        clear();
        int opcao;
        ArrayList<Cliente> clientes = new ArrayList<>();

        do{
            IO.println("Menu\nDigite a opcao desejada:\n1 - Adicionar Cliente\n2 - Editar Cliente\n3 - Remover Cliente\n4 - Listar Clientes\n5 - Menu Endereços\n0 - Sair");

            opcao = Integer.parseInt(IO.readln("Opção escolhida: "));

            switch (opcao){
                case 1:
                    this.adicionarCliente(clientes);
                    break;
                case 2:
                    this.editarCliente(clientes);
                    break;
                case 3:
                    this.removerCliente(clientes);
                    break;
                case 4:
                    this.listarCliente(clientes);
                    break;
                case 5:
                    this.menuEndereco(clientes);
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        }while (opcao != 0);
    }

    public void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void adicionarCliente(ArrayList<Cliente>clientes){
        clear();
        ArrayList<Endereco> enderecos = new ArrayList<>();

        String nome = IO.readln("Qual o nome do Cliente? ");
        String cpf = IO.readln("Qual o cpf do cliente? ");
        String dataNascimento = IO.readln("Qual a data de nascimento? dia/mês/ano");
        String logradouro = IO.readln("Qual o logradouro? ");
        String bairro = IO.readln("Qual o bairro? ");
        String cidade = IO.readln("Qual sua cidade? ");
        String cep = IO.readln("Qual seu CEP? ");
        String descricao = IO.readln("Qual é este endereço? ");

        Endereco endereco = new Endereco(logradouro, bairro, cidade, cep, descricao);
        enderecos.add(endereco);

        Cliente cliente = new Cliente(nome, cpf, dataNascimento, enderecos);
        clientes.add(cliente);




    }

    public void editarCliente(ArrayList<Cliente>clientes){
        clear();
        IO.println("Escolha um Cliente para editar: ");
        for (int i = 0; i < clientes.size(); i++) {
            IO.println("Indice " + i + " " + clientes.get(i));
        }

        int indice = Integer.parseInt(IO.readln("Digite o indice do cliente que deseja editar: "));

        String nome = IO.readln("Qual o nome do CLiente? ");
        String cpf = IO.readln("Qual o cpf do cliente");
        String dataNascimento = IO.readln("Qual a data de nascimento? dia/mês/ano");

        clientes.get(indice).setNome(nome);
        clientes.get(indice).setCpf(cpf);
        clientes.get(indice).setDataNascimento(dataNascimento);
    }

    public void removerCliente(ArrayList<Cliente>clientes){
        clear();
        IO.println("Escolha um Cliente para remover: ");
        for (int i = 0; i < clientes.size(); i++) {
            IO.readln("Indice" + i + " " + clientes.get(i));
        }

        int indice = Integer.parseInt(IO.readln("Digite o indice do cliente que deseja remover: "));

        Cliente cliente = clientes.get(indice);
        clientes.remove(cliente);



    }

    public void listarCliente(ArrayList<Cliente>clientes){
        clear();
            IO.println("Lista de Clientes");

        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((clientes.get(i).toString()));

            }
        }

    public void menuEndereco(ArrayList<Cliente> clientes){
        clear();
        int opcao;
        do{
            IO.println("Menu\nDigite a opcao desejada:\n1 - Adicionar Endereço\n2 - Editar Endereço\n3 - Remover Endereço\n4 - Listar Endereços\n0 - Voltar");

            opcao = Integer.parseInt(IO.readln("Opcao escolhida: "));

            switch (opcao){
                case 1:
                    this.adicionarEndereco(clientes);
                    break;
                case 2:
                    this.editarEndereco(clientes);
                    break;
                case 3:
                    this.removerEndereco(clientes);
                    break;
                case 4:
                    this.listarEnderecos(clientes);
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        }while (opcao != 0);
    }

    public void adicionarEndereco(ArrayList<Cliente>clientes){
        clear();
        IO.println("Escolha um Cliente para adicionar um endereço: ");

        for (int i = 0; i < clientes.size(); i++) {
            IO.println("Indice " + i + " " + clientes.get(i));
        }

        int indice = Integer.parseInt(IO.readln("Digite o indice do cliente: "));

        String logradouro = IO.readln("Qual o logradouro? ");
        String bairro = IO.readln("Qual o bairro? ");
        String cidade = IO.readln("Qual sua cidade? ");
        String cep = IO.readln("Qual seu CEP? ");
        String descricao = IO.readln("Qual é este endereço? ");

        Endereco novoEndereco = new Endereco(logradouro, bairro, cidade, cep, descricao);

        clientes.get(indice).getEnderecos().add(novoEndereco);
    }

    public void editarEndereco(ArrayList<Cliente>clientes){
        clear();
        IO.println("Escolha um Cliente para editar o endereço: ");
        for (int i = 0; i < clientes.size(); i++) {
            IO.println("Indice " + i + " " + clientes.get(i));
        }

        int indice = Integer.parseInt(IO.readln("Digite o indice do cliente: "));

        for (int j = 0; j < clientes.get(indice).getEnderecos().size(); j++) {
            IO.println("Endereco " + j + " " + clientes.get(indice).getEnderecos().get(j));
        }

        int indiceEndereco = Integer.parseInt(IO.readln("Digite o indice do endereco: "));

        String logradouro = IO.readln("Qual o logradouro? ");
        String bairro = IO.readln("Qual o bairro? ");
        String cidade = IO.readln("Qual sua cidade? ");
        String cep = IO.readln("Qual seu CEP? ");
        String descricao = IO.readln("Qual é este endereço? ");

        clientes.get(indice).getEnderecos().get(indiceEndereco).setLogradouro(logradouro);
        clientes.get(indice).getEnderecos().get(indiceEndereco).setBairro(bairro);
        clientes.get(indice).getEnderecos().get(indiceEndereco).setCidade(cidade);
        clientes.get(indice).getEnderecos().get(indiceEndereco).setCep(cep);
        clientes.get(indice).getEnderecos().get(indiceEndereco).setDescricao(descricao);


    }

    public void removerEndereco(ArrayList<Cliente>clientes){
        clear();
        IO.println("Escolha um Cliente para remover o endereço: ");
        for (int i = 0; i < clientes.size(); i++) {
            IO.println("Indice " + i + " " + clientes.get(i));
        }

        int indice = Integer.parseInt(IO.readln("Digite o indice do cliente: "));

        for (int j = 0; j < clientes.get(indice).getEnderecos().size(); j++) {
            IO.println("Endereco " + j + " " + clientes.get(indice).getEnderecos().get(j));
        }

        int indiceEndereco = Integer.parseInt(IO.readln("Digite o indice do endereco: "));

        Endereco endereco = clientes.get(indice).getEnderecos().get(indiceEndereco);

        clientes.get(indice).getEnderecos().remove(endereco);

    }

    public void listarEnderecos(ArrayList<Cliente>clientes){
        clear();
        IO.println("Escolha um Cliente para ver os endereços: ");
        for (int i = 0; i < clientes.size(); i++) {
            IO.println("Indice " + i + " " + clientes.get(i));
        }

        int indice = Integer.parseInt(IO.readln("Digite o indice do cliente: "));

        for (int j = 0; j < clientes.get(indice).getEnderecos().size(); j++) {
            IO.println("Endereco " + j + " " + clientes.get(indice).getEnderecos().get(j));
        }
    }

    }

