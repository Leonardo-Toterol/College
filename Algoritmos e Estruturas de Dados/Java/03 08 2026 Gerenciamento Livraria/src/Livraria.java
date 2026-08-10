import java.util.ArrayList;
import java.util.List;

public class Livraria {

    private List<Livro> livros;

    public Livraria() {
        this.livros = new ArrayList<>();
    }

    public void inserirLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        for (int i = 0; i < livros.size(); i++) {
            System.out.println("Livro " + livros.get(i).getTitulo());
        }
    }

    public void listarDisponiveis() {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).isDisponivel()) {
                System.out.println("Livro " + livros.get(i).getTitulo());
            }
        }
    }
}