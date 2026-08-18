public class MeuVetor {
    private int[] elementos;
    private int tamanho;

    public MeuVetor(int capacidadeInicial) {
        this.elementos = new int[capacidadeInicial];
        this.tamanho = 0;
    }

    // TODO 1: Implementar método para adicionar um elemento ao final
    public void adicionar(int elemento) {
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == 0) {
                elementos[i] = elemento;
                return;
            }
        }
    }

    // TODO 2: Implementar método que dobra o tamanho do array caso esteja cheio
    private void garantirEspaco() {
        if (tamanho == elementos.length ){
            int[] novoVetor = new int[elementos.length * 2];
        }
    }

    // TODO 3: Retornar o elemento de uma posição específica
    // Tratar erro se a posição for inválida!
    public int obter(int posicao) {
        // Seu código aqui
        return -1;
    }

    // TODO 4: Remover elemento de uma posição
    // Dica: Após remover, você precisa "deslocar" os elementos da direita para a esquerda.
    public void remover(int posicao) {
        // Seu código aqui
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void listarVetor(){
        for (int i = 0; i < elementos.length; i++) {
            System.out.println(elementos[i]);
        }
    }

    // ==================== DESAFIOS BÔNUS ====================
    // Os métodos abaixo NÃO são obrigatórios. Implemente-os apenas
    // se terminar os métodos acima antes do restante da turma.

    // BÔNUS 1: Adicionar um elemento em uma posição (índice) específica,
    // deslocando os elementos seguintes para a direita.
    // Dica: é o "inverso" do remover — você desloca da direita para a esquerda
    // para abrir espaço, em vez de fechar espaço.
    public void adicionarNoIndice(int indice, int elemento) {
        // Seu código aqui
    }

    // BÔNUS 2: Remover a PRIMEIRA ocorrência de um valor (não de uma posição!).
    // Dica: primeiro descubra o índice do valor, depois reaproveite a lógica do remover().
    public void removerPorValor(int valor) {
        // Seu código aqui
    }

    // BÔNUS 3: Verificar se um valor existe no vetor.
    public boolean contem(int elemento) {
        // Seu código aqui
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