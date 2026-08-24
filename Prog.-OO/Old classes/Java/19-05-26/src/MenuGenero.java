public class MenuGenero {

    public void inicio(Livro livro){

        int r;
        do {
            System.out.println("Menu Genero\nDigite a opcao desejada:\n1 - Adicionar Genero\n2 - Editar Genero\n3 - Remover Genero\n4 - Listar Genero\n0 - Sair\n");

            r = Integer.parseInt(IO.readln("Digite a opção desejada: "));
            switch (r){
                case 1:
                    this.adicionar(livro);
                    break;
                case 2:
                    this.editar(livro);
                    break;
                case 3:
                    this.remover(livro);
                    break;
                case 4:
                    this.listar(livro);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção incorreta, tente novamente.");
                    break;
            }
        } while ( r != 0);

    }

    public void adicionar(Livro livro){
        String descricao = IO.readln("Digite a descrição do genero: ");
        String tag = IO.readln("Digite a tag do genero: ");

        Genero genero = new Genero(descricao, tag);
        livro.getGeneros().add(genero);
    }

    public void editar(Livro livro){

        listar(livro);
        int indice = Integer.parseInt(IO.readln("Digite o indice do genero que deseja editar:"));

        livro.getGeneros().get(indice).setDescricao(IO.readln("Digite a nova descrição: "));
        livro.getGeneros().get(indice).setTag(IO.readln("Digite a nova tag: "));

    }

    public void remover(Livro livro){

        listar(livro);

        livro.getGeneros().remove(Integer.parseInt(IO.readln("Digite o indice do genero que deseja remover")));
    }
    public void listar(Livro livro){
        for (int i = 0; i < livro.getGeneros().size(); i++) {
            System.out.println("Genero " + i + " " + livro.getGeneros().get(i));
        }
    }
}

