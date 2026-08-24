public class MeuVetor {
    private int[] elementos;
    private int tamanho;

    public MeuVetor(int capacidadeInicial) {
        this.elementos = new int[capacidadeInicial];
        this.tamanho = 0;
    }

    // TODO 1: Implementar método para adicionar um elemento ao final
    public void adicionar(int elemento) {
        garantirEspaco();
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == 0) {
                elementos[i] = elemento;
                tamanho++;
                return;
            }
        }
    }

    // TODO 2: Implementar método que dobra o tamanho do array caso esteja cheio
    private void garantirEspaco() {
        if (tamanho == elementos.length ){
            int[] novoVetor = new int[elementos.length * 2];

            for (int i = 0; i < elementos.length; i++) {
                novoVetor[i] = elementos[i];
            }
            elementos = novoVetor;
        }
    }

    // TODO 3: Retornar o elemento de uma posição específica
    // Tratar erro se a posição for inválida!
    public int obter(int posicao) {

        if (posicao >= 0 && posicao < tamanho) {
            System.out.println("O Valor do indíce " + posicao + " é: " + elementos[posicao]);
            System.out.println();
            return elementos[posicao];
        }
        System.out.println("Posição não encontrada.");
        System.out.println();
        return 0;
        }

    // TODO 4: Remover elemento de uma posição
    // Dica: Após remover, você precisa "deslocar" os elementos da direita para a esquerda.
    public void remover(int posicao) {

        garantirEspaco();
        if (posicao >= 0 && posicao < tamanho) {

            for (int i = posicao; i < tamanho; i++) {
                elementos[i] = elementos[i + 1];
                }
            tamanho--;
        }
        else {
            System.out.println("Posição não encontrada.");
            System.out.println();
        }
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void listarVetor(){
        for (int i = 0; i < elementos.length; i++) {
            System.out.println("Indice:" + i + " = " + elementos[i]);
        }
        System.out.println("\n");
    }

    // ==================== DESAFIOS BÔNUS ====================

    public void adicionarNoIndice(int indice, int elemento) {
        garantirEspaco();

        if (indice >= 0 && indice < tamanho){
            for (int i = tamanho; i > indice; i--) {
                elementos[i] = elementos[i - 1];
            }
        elementos[indice] = elemento;
            tamanho++;
        }
    }


    public void removerPorValor(int valor) {

        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == valor){

                for (int j = i; j < tamanho - 1; j++) {
                    elementos[j] = elementos[j + 1];
                }
                elementos[tamanho - 1] = 0;
                tamanho--;
                return;
                }
        }
        System.out.println("Valor não encontrado.");
    }


    public boolean contem(int elemento) {

        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == elemento){
                System.out.println("O valor " + elemento + " existe no índice: " + i );
                return true;
            }
        }
        System.out.println("O valor " + elemento + " não foi encontrado.");
        return false;
    }


    // BÔNUS 4: Sobrescrever o toString() para listar os elementos de forma legível,
    // por exemplo: "[10, 20, 30]". Use isso no lugar de um método "listar()" separado.
    @Override
    public String toString() {
        // Seu código aqui
        return "";
    }
}