import java.util.Arrays;

public class MinhaMatriz {
    private int[][] dados;
    private int linhas;
    private int colunas;

    public MinhaMatriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.dados = new int[linhas][colunas];
    }

    // TODO 1: Inserir um valor em uma linha e coluna específicas
    public void setValor(int linha, int coluna, int valor) {
        dados[linha][coluna] = valor;
    }


    // TODO 2: Retornar o valor de uma coordenada
    public int getValor(int linha, int coluna) {
        System.out.println(dados[linha][coluna]);
        System.out.println();
        return 0;
    }

    // TODO 3: Preencher a matriz inteira com um valor padrão
    public void preencher(int valorPadrao) {

        for (int i = 0; i < dados.length; i++) {
            for (int j = 0; j < dados.length; j++) {
                dados[i][j] = valorPadrao;
            }
        }
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void imprimirMatriz(){

        for (int[] linha : dados){
            for (int valor : linha){
                System.out.print(valor + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // ==================== DESAFIOS BÔNUS ====================

    public MinhaMatriz somar(MinhaMatriz outra) {

        MinhaMatriz novaMatriz = new MinhaMatriz(linhas, colunas);

        for (int i = 0; i < dados.length; i++) {
            for (int j = 0; j < dados[i].length; j++) {
                int soma = dados[i][j] + outra.dados[i][j];
                novaMatriz.dados[i][j] = soma;
            }
        }
        novaMatriz.imprimirMatriz();
        return novaMatriz;
    }

    public int somarLinha(int linha) {

        int soma = 0;

        for (int i = 0; i < dados[linha].length; i++) {
            soma += dados[linha][i];
        }
        System.out.println(soma);
        System.out.println();
        return soma;
    }

    // BÔNUS 3: Somar todos os valores de uma coluna específica.
    public int somarColuna(int coluna) {

        int soma = 0;

        for (int i = 0; i < dados.length; i++) {
            soma += dados[i][coluna];
        }
        System.out.println(soma);
        return soma;
    }

    // BÔNUS 4: Retornar o maior valor de toda a matriz.
    public int obterMaior() {
        // Seu código aqui
        return Integer.MIN_VALUE;
    }

    // BÔNUS 5: Retornar o menor valor de toda a matriz.
    public int obterMenor() {
        // Seu código aqui
        return Integer.MAX_VALUE;
    }

    // BÔNUS 6: Calcular a média de todos os valores da matriz.
    public double calculaMedia() {
        // Seu código aqui
        return 0.0;
    }

    // BÔNUS 7: Sobrescrever o toString() para listar a matriz linha por linha,
    // por exemplo:
    // 1 2 3
    // 4 5 6
    // 7 8 9
    @Override
    public String toString() {
        // Seu código aqui
        return "";
    }
}