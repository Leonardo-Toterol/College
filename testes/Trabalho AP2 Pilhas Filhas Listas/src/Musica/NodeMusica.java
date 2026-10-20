package Musica;
public class NodeMusica {

    private Musica musica;
    private NodeMusica anterior;
    private NodeMusica proximo;

    public NodeMusica(Musica musica) {
        this.musica = musica;
        this.anterior = null;
        this.proximo = null;
    }

    public Musica getMusica() {
        return musica;
    }

    public NodeMusica getAnterior() {
        return anterior;
    }

    public NodeMusica getProximo() {
        return proximo;
    }

    public void setAnterior(NodeMusica anterior) {
        this.anterior = anterior;
    }

    public void setProximo(NodeMusica proximo) {
        this.proximo = proximo;
    }

}


