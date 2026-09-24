public class Fila {

    private Pessoa[] fila;
    private int tamanho;
    double tempoAtendimento = 0;
    int clientesAtendidos = 0;

    public Fila(int capacidade){
        this.fila = new Pessoa[capacidade];
        this.tamanho = 0;
        this.tempoAtendimento = 0;
        this.clientesAtendidos = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public boolean estaCheia(){
        return tamanho == fila.length;
    }

    public boolean enfileirar(Pessoa e){

        if (!estaCheia()){
            this.fila[tamanho] = e;
            tamanho++;
            System.out.println("Pessoa " + e.getNome() + " adicionada a fila.");
            return true;
        }
        return false;
    }

    public Pessoa desenfileirar(){

        if (!estaVazia()){
            Pessoa pessoaRemovida = new Pessoa(this.fila[0].getNome());

            for (int i = 1; i < tamanho; i++) {
                fila[i - 1] = fila[i];
            }
            tamanho--;
            tempoAtendimento += pessoaRemovida.getTempoAtendimento();
            clientesAtendidos ++;
            System.out.println("Olá " + pessoaRemovida.getNome() + ", você será atendido em"
                    + pessoaRemovida.getTempoAtendimento() +" minutos.");
            return pessoaRemovida;
        }
        System.out.println("Foram atendidas " + clientesAtendidos + " clientes em " + tempoAtendimento + " minutos.");
        return null;
    }


}
