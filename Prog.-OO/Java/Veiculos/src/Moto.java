public class Moto extends Veiculos{

    String cilindradas;

    public Moto(String nome, String modelo, int ano, String cilindradas) {
        super(nome, modelo, ano);
        this.cilindradas = cilindradas;
    }

    public Moto(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindradas='" + cilindradas + '\'' +
                ", nome='" + nome + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}
