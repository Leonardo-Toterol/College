public class Carro extends Veiculos {

    int portas;

    public Carro(String nome, String modelo, int ano, int portas) {
        super(nome, modelo, ano);
        this.portas = portas;
    }

    public Carro(int portas) {
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "portas='" + portas + '\'' +
                ", nome='" + nome + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}
