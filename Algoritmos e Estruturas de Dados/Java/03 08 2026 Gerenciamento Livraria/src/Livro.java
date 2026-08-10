public class Livro {

    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean disponivel;

    public Livro(String titulo, String autor, int numeroPaginas, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", disponivel=" + disponivel +
                '}';
    }

    public void exibiDetalhes(Livro livro){
        System.out.println(livro);
    }

    public void reservar(){
        if (this.isDisponivel()){
            this.setDisponivel(false);
            System.out.println("O livro " + this.getTitulo() + " foi reservado!");
        }
        else {
            System.out.println("O livro não está disponível.");
        }
    }

    public void devolver(){
        if (!this.isDisponivel()){
            this.setDisponivel(true);
            System.out.println("O livro " + this.getTitulo() + " foi devolvido!");
        }
        else {
            System.out.println("O livro já está disponível.");
        }
    }
}
