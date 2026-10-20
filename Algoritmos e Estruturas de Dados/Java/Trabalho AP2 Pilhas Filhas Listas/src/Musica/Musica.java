package Musica;

public class Musica {

    private String titulo;
    private String artista;
    private String album;
    private int duracao;

    public Musica(String titulo, String artista, String album, int duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public String getAlbum() {
        return album;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getDuracaoPronta() {
        int minutos = duracao / 60;
        int segundos = duracao % 60;

        if (segundos < 10) {
            return minutos + ":0" + segundos;
        }

        return minutos + ":" + segundos;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", album='" + album + '\'' +
                ", duracao=" + duracao +
                '}';
    }
}


