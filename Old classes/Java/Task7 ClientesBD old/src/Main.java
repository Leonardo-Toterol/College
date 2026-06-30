import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    Scanner sc = new Scanner(System.in);
    ArrayList<Cliente> clientes = new ArrayList<>();

    public static void main(String[] args){
        Main m = new Main();
        m.menu(m.clientes);

    }

    public int menu(ArrayList <Cliente> clientes){
        int r;

        do{
            System.out.println("\nBanco de Dados\n1° Adicionar Cliente\n2° Remover Cliente\n3° Editar Cliente\n4° Listar Clientes\n5° Sair\n");
            r = sc.nextInt();
            sc.nextLine();

            switch (r){
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
                    System.out.println("Encerrando...");
                    break;
            }
        } while (r != 5);
            return r;

    }

    public void adicionarCliente (ArrayList <Cliente> clientes){

        System.out.println("Digite o nome do cliente: ");
        String nome = sc.nextLine();

        System.out.println(("Digite o cpf: "));
        String cpf = sc.nextLine();

        double saldo = 0;

        Cliente cliente = new Cliente(nome, cpf, saldo);

        clientes.add(cliente);
        System.out.println("Cliente adicionado");
    }

    public void removerCliente (ArrayList <Cliente> clientes){

        System.out.println("Digite o cpf: ");
        String cpf = sc.nextLine();

        boolean encontrou = false;

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).cpf.equals(cpf)) {
                clientes.remove(i);
                encontrou = true;
            }

        }

        if (!encontrou){
            System.out.println("Cliente não encontrado.");
        }
        else{
            System.out.println("Cliente encontrado.");
        }
    }

    public void listarClientes (ArrayList <Cliente> clientes){

        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i));

        }
    }

    public void editarCliente (ArrayList <Cliente> clientes){

        System.out.println("O que deseja editar?\n1° Nome\n2° CPF\n: ");
        int r = sc.nextInt();
        sc.nextLine();

        if (r == 1) {
            System.out.println("Digite o nome que deseja atualizar: ");
            String nome = sc.nextLine();

            for (int i = 0; i < clientes.size(); i++) {
                if (clientes.get(i).nome.equals(nome)) {
                    System.out.println("Digite o novo nome: ");
                    String nomeCorreto = sc.nextLine();
                    clientes.get(i).nome = nomeCorreto;
                }
            }
        }
        else if (r == 2){
                System.out.println("Digite o cpf que deseja atualizar: ");
                String cpf = sc.nextLine();

                for (int j = 0; j < clientes.size(); j++) {
                    if (clientes.get(j).cpf.equals(cpf)){
                        System.out.println("Digite o novo cpf: ");
                        String cpfCorreto = sc.nextLine();
                        clientes.get(j).cpf = cpfCorreto;
                    }

                }
        }
        else {
                    System.out.println("Opção incorreta.");
                }
            }
        }

