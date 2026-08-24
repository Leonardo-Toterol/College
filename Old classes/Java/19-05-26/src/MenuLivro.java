import java.util.ArrayList;

public class MenuLivro {

    private ArrayList<Livro> livros = new ArrayList<>();

    MenuGenero menuGenero = new MenuGenero();

    public void inicio(){
        int r;
        do {
            System.out.println("Menu Livro\nDigite a opcao desejada:\n1 - Adicionar Livro\n2 - Editar Livro\n3 - Remover Livro\n4 - Listar Livros\n0 - Sair\n");

            r = Integer.parseInt(IO.readln("Digite a opção desejada: "));
            switch (r){
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
                    System.out.println("Opção incorreta, tente novamente.");
                    break;
            }
        } while ( r != 0);

        }

        public void adicionar(){

            String titulo = IO.readln("Digite o título do livro: ");
            String anoLancamento = IO.readln("Digite o ano de lançamento: ");
            ArrayList<Genero> generos = new ArrayList<>();

            Livro livro = new Livro(titulo, anoLancamento, generos);
            livros.add(livro);

            this.menuGenero.inicio(livro);
        }

        public void editar(){

            listar();
            int indice = Integer.parseInt(IO.readln("Digite o indice do livro que deseja editar:"));

            livros.get(indice).setTitulo(IO.readln("Digite o novo título: "));
            livros.get(indice).setAnoLancamento(IO.readln("Digite o novo ano de lançamento: "));

            this.menuGenero.inicio(livros.get(indice));

        }

        public void remover(){

            listar();
            livros.remove(Integer.parseInt(IO.readln("Digite o indice do livro que deseja remover:")));

        }

        public void listar(){

            for (int i = 0; i < livros.size(); i++) {
                System.out.println("Livro " + i + " " + livros.get(i));
            }
        }

    }

