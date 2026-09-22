public class Pilha {

    private int[] pilha;
    private int tamanho;

    public Pilha(int capacidade){
        this.pilha = new int[capacidade];
        this.tamanho = 0;
    }


    public int getTamanho() {
        return tamanho;
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public boolean estaCheia(){
        return tamanho == this.pilha.length;
    }

    public boolean empilhar(int numero) {
        if (!estaCheia()) {
            this.pilha[tamanho] = numero;
            tamanho++;
            return true;
        }
        return false;
    }

    public int desempilhar(){
        if(!estaVazia()){
            tamanho--;
            return this.pilha[tamanho];
        }
        return 0;
    }

    public void verPilha(){
        System.out.print("[ ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(pilha[i] + ", ");
        }
        System.out.print("]");
        System.out.println();
    }


}
