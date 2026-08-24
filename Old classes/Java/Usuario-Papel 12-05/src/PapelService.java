
public class PapelService {

    public void inicio(Usuario usuario) {
        int opcao;

        do {
            IO.println("Menu Papel\nDigite a opcao desejada:\n1 - Adicionar\n2 - Editar\n3 - Remover\n4 - Listar\n0 - Sair");

            opcao = Integer.parseInt(IO.readln("Opção escolhida: "));

            switch (opcao) {
                case 1:
                    this.adicionar(usuario);
                    break;
                case 2:
                    this.editar(usuario);
                    break;
                case 3:
                    this.remover(usuario);
                    break;
                case 4:
                    this.listar(usuario);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção Incorreta, tente novamente.");
                    break;
            }

        }while (opcao != 0) ;
    }

    public void adicionar(Usuario usuario){
        String descricao = IO.readln("Qual a descricao do Papel? ");
        String nome = IO.readln("Qual o nome do Papel? ");
        String tag = IO.readln("Qual a tag do Papel? ");

        Papel papel = new Papel(descricao, nome, tag);
        usuario.getPapeis().add(papel);
    }

    public void listar(Usuario usuario){
        for (int i = 0; i < usuario.getPapeis().size(); i++) {
            System.out.println("Indice " + i + " " + usuario.getPapeis().get(i));
        }
    }

    public void editar(Usuario usuario){
        this.listar(usuario);

        int indice = Integer.parseInt(IO.readln("Digite o indice para editar: "));

        usuario.getPapeis().get(indice).setDescricao("Digite a Descrição");
    }

    public void remover(Usuario usuario){
        this.listar(usuario);

        int indice = Integer.parseInt(IO.readln("Digite o indice para editar: "));
        usuario.getPapeis().remove(indice);
    }
}
