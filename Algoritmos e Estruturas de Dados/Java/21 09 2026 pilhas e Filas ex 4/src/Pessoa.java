public class Pessoa {

    private String nome;
    private double tempoAtendimento;

    public Pessoa(String nome){
        this.nome = nome;
        this.tempoAtendimento = 10.00;
    }

    public String getNome() {
        return nome;
    }

    public double getTempoAtendimento() {
        return tempoAtendimento;
    }
}
