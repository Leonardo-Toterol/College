public class Pilha {

    String pilha[];
    int tamanho;

    public Pilha(int capacidade) {
        this.pilha = new String[capacidade];
        this.tamanho = 0;
    }

    public Pilha(String... a){
        this.pilha = a;
        this.tamanho = a.length;
    }

    public void balanceado() {

        Pilha pilhaTemp = new Pilha(pilha.length);

        boolean balanceado = true;

        for (int i = 0; i < tamanho; i++) {

            if (pilha[i].equals("(")) {
                    pilhaTemp.empilhar("(");
                }

            else if (pilha[i].equals(")")) {
                if (!pilhaTemp.estaVazia()) {
                    if (!pilhaTemp.desempilhar().equals("(")){
                        balanceado = false;
                    }
                } else {
                    balanceado = false;
                }
            }

            else if (pilha[i].equals("{")) {
                pilhaTemp.empilhar("{");
            }

            else if (pilha[i].equals("}")) {
                if (!pilhaTemp.estaVazia()) {
                    if (!pilhaTemp.desempilhar().equals("{")){
                        balanceado = false;
                    }
                } else {
                    balanceado = false;
                }
            }

            else if (pilha[i].equals("[")) {
                pilhaTemp.empilhar("[");
            }

            else if (pilha[i].equals("]")) {
                if (!pilhaTemp.estaVazia()) {
                    if (!pilhaTemp.desempilhar().equals("[")){
                        balanceado = false;
                    };
                } else {
                    balanceado = false;
                }
            }

        }

        if (pilhaTemp.estaVazia() && balanceado){
            System.out.println("Balanceado.");
        }
        else {
            System.out.println("Não está balanceado.");
        }
    }

    public boolean empilhar(String e){
        if (!estaCheia()){
            this.pilha[tamanho] = e;
            tamanho++;
            return true;
        }
        return false;
    }

    public String desempilhar(){
        if (!estaVazia()){
            tamanho--;
            return this.pilha[tamanho];
        }
        return null;
    }

    public boolean estaCheia(){
        return tamanho == pilha.length;
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public int getTamanho(){
        System.out.println(tamanho);
        return tamanho;
    }
}
