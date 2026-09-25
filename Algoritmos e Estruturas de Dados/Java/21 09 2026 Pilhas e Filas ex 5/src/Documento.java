import java.util.Random;

public class Documento {
    private String nome;
    private int numeroPaginas;

    Random random = new Random();

    public Documento(String nome){
        this.nome = nome;
        this.numeroPaginas = random.nextInt(300);
    }

    public Documento(String nome, int paginas){
        this.nome = nome;
        this.numeroPaginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
}
