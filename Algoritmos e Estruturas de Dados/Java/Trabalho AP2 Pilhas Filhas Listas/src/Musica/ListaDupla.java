package Musica;

public class ListaDupla {

    private NodeMusica inicio;
    private NodeMusica fim;
    private NodeMusica atual;
    private int tamanho;

    public ListaDupla() {
        this.inicio = null;
        this.fim = null;
        this.atual = null;
        this.tamanho = 0;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public int getTamanho() {
        return tamanho;
    }

    public Musica getMusicaAtual() {
        if (atual == null) {
            return null;
        }

        return atual.getMusica();
    }

    public void adicionarInicio(Musica musica) {

        NodeMusica novoNo = new NodeMusica(musica);

        if (estaVazia()) {
            inicio = novoNo;
            fim = novoNo;
            atual = novoNo;
        } else {
            novoNo.setProximo(inicio);
            inicio.setAnterior(novoNo);
            inicio = novoNo;
        }
        tamanho++;
    }

    public void adicionarFim(Musica musica) {

        NodeMusica novoNo = new NodeMusica(musica);

        if (estaVazia()) {
            inicio = novoNo;
            fim = novoNo;
            atual = novoNo;
        } else {
            fim.setProximo(novoNo);
            novoNo.setAnterior(fim);
            fim = novoNo;
        }
        tamanho++;
    }

    public boolean adicionarNaPosicao(int posicao, Musica musica) {

        if (posicao == 0) {
            adicionarInicio(musica);
            return true;
        }

        if (posicao == tamanho) {
            adicionarFim(musica);
            return true;
        }

        NodeMusica anterior = obterNo(posicao - 1);
        NodeMusica proximo = anterior.getProximo();
        NodeMusica novoNo = new NodeMusica(musica);

        novoNo.setAnterior(anterior);
        novoNo.setProximo(proximo);

        anterior.setProximo(novoNo);
        proximo.setAnterior(novoNo);

        tamanho++;
        return true;
    }

    public boolean proximaMusica() {
        if (atual == null || atual.getProximo() == null) {
            return false;
        }

        atual = atual.getProximo();
        return true;
    }

    public boolean musicaAnterior() {
        if (atual == null || atual.getAnterior() == null) {
            return false;
        }

        atual = atual.getAnterior();
        return true;
    }

    public boolean removerPorTitulo(String titulo) {

        NodeMusica no = inicio;

        while (no != null) {
            if (no.getMusica().getTitulo().equalsIgnoreCase(titulo)) {
                removerNo(no);
                return true;
            }

            no = no.getProximo();
        }

        return false;
    }

    public boolean removerNaPosicao(int posicao) {
        NodeMusica no = obterNo(posicao);

        if (no == null) {
            return false;
        }

        removerNo(no);
        return true;
    }

    private void removerNo(NodeMusica no) {

        NodeMusica anterior = no.getAnterior();
        NodeMusica proximo = no.getProximo();

        if (no == inicio) {
            inicio = proximo;
        } else {
            anterior.setProximo(proximo);
        }

        if (no == fim) {
            fim = anterior;
        } else {
            proximo.setAnterior(anterior);
        }

        if (no == atual) {
            atual = (proximo != null) ? proximo : anterior;
        }

        tamanho--;

        if (tamanho == 0) {
            inicio = null;
            fim = null;
            atual = null;
        }
    }

    public void listar() {

        if (estaVazia()) {
            System.out.println("A playlist esta vazia.");
            return;
        }

        NodeMusica no = inicio;
        int posicao = 0;

        while (no != null) {
            String marcador = "";

            if (no == atual) {
                marcador = " musica atual";
            }

            System.out.println(posicao + " - " + no.getMusica());

            no = no.getProximo();
            posicao++;
        }
    }

    private NodeMusica obterNo(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            return null;
        }

        NodeMusica no;

        if (posicao < tamanho / 2) {
            no = inicio;

            for (int i = 0; i < posicao; i++) {
                no = no.getProximo();
            }
        } else {
            no = fim;

            for (int i = tamanho - 1; i > posicao; i--) {
                no = no.getAnterior();
            }
        }

        return no;
    }
}
