import java.util.ArrayList;

public class Livro {

    private String titulo;
    private String anoLancamento;
    private ArrayList<Genero> generos;


    public Livro() {
    }

    public Livro(String titulo, String anoLancamento, ArrayList<Genero> generos) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.generos = generos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public ArrayList<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(ArrayList<Genero> generos) {
        this.generos = generos;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", anoLancamento='" + anoLancamento + '\'' +
                ", generos=" + generos +
                '}';
    }

}
