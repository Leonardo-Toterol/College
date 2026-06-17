import java.util.ArrayList;

public class Streaming {

    private String nome;
    private String dataContratracao;
    private double valor;

    public Streaming() {
    }

    public Streaming(String nome, String dataContratracao, double valor) {
        this.nome = nome;
        this.dataContratracao = dataContratracao;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataContratracao() {
        return dataContratracao;
    }

    public void setDataContratracao(String dataContratracao) {
        this.dataContratracao = dataContratracao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    @Override
    public String toString() {
        return "Streaming{" +
                "nome='" + nome + '\'' +
                ", dataContratracao='" + dataContratracao + '\'' +
                ", valor=" + valor +
                '}';
    }
}
