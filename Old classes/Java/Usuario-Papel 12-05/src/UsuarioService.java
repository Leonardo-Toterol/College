import java.util.ArrayList;

public class UsuarioService {
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    private PapelService papelService = new PapelService();


    public void inicio() {
        int opcao;

        do {
            IO.println("Menu Usuario\nDigite a opcao desejada:\n1 - Adicionar\n2 - Editar\n3 - Remover\n4 - Listar\n0 - Sair");

            opcao = Integer.parseInt(IO.readln("Opção escolhida: "));

            switch (opcao) {
                case 1:
                    this.adicionar();
                    break;
                case 2:
                    this.editar();
                    break;
                case 3:
                    this.remover();
                    break;
                case 4:
                    this.listar();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção Incorreta, tente novamente.");
                    break;
            }

        }while (opcao != 0) ;

    }

    public void adicionar(){

        String nome = IO.readln("Qual o nome do Cliente? ");
        String username = IO.readln("Qual o username do cliente? ");
        String password = IO.readln("Qual a senha? ");

        Usuario usuario = new Usuario(nome, username, password);
        usuarios.add(usuario);

        this.papelService.inicio(usuario);
    }

    public void editar(){
        System.out.println("Escolha o usuario para editar: ");
        this.listar();

        int indice = Integer.parseInt(IO.readln("Qual indice deseja editar? "));

        usuarios.get(indice).setNome(IO.readln("Qual o nome do Cliente? "));
        usuarios.get(indice).setUsername(IO.readln("Qual o username do cliente? "));
        usuarios.get(indice).setPassword(IO.readln("Qual a senha? "));


        this.papelService.inicio(usuarios.get(indice));

    }

    public void remover(){
        System.out.println("Escolha o usuario para remover: ");
        this.listar();

        usuarios.remove(Integer.parseInt(IO.readln("Qual indice deseja remover? ")));

    }

    public void listar(){
        for (int i = 0; i < usuarios.size(); i++) {
            IO.println("Indice do Usuario: " + i + " " + usuarios.get(i));
        }

    }



}
