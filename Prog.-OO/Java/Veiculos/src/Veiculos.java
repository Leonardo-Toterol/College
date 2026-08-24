public class Veiculos {

    String nome;
    String modelo;
    int ano;

    public Veiculos(String nome, String modelo, int ano) {
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Veiculos() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Veiculos{" +
                "nome='" + nome + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}
