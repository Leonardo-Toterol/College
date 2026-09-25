import javax.print.Doc;

public class Fila {
    private Documento[] fila;
    private int tamanho;
    private Documento maiorDocumento;
    private int paginasImpressas;

    public Fila(int capacidade){
        this.fila = new Documento[capacidade];
        this.tamanho = 0;
        this.maiorDocumento = new Documento("Maior", 0);
        this.paginasImpressas = 0;
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public boolean estaCheia(){
        return tamanho == fila.length;
    }

    public boolean enfileirar(Documento e){
        if (!estaCheia()){
            this.fila[tamanho] = e;
            tamanho++;
            System.out.println("Documento " + e.getNome() + " adicionado a fila.");
            return true;
        }
        return false;
    }

    public Documento desenfileirar(){
        System.out.println();
        if (!estaVazia()){
            Documento documentoRemovido = new Documento(this.fila[0].getNome());

            for (int i = 1; i < tamanho; i++) {
                fila[i - 1] = fila[i];
            }
            System.out.println("Imprimindo " + documentoRemovido.getNome() +
                    " com " + documentoRemovido.getNumeroPaginas() + " páginas.");
            tamanho--;
            paginasImpressas += documentoRemovido.getNumeroPaginas();
            if (documentoRemovido.getNumeroPaginas() > maiorDocumento.getNumeroPaginas()){
                maiorDocumento = documentoRemovido;
            }
            return documentoRemovido;
        }
        System.out.println("O maior documento foi " + maiorDocumento.getNome() + " e o número de páginas impressas foi " +
                paginasImpressas + ".");
        return null;
    }

}
