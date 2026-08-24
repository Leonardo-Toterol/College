public class Moto extends Veiculo implements IMotinho
{

    int cilindradas;


    public Moto() {
    }

    public void empinar() {
        System.out.println("Olha o grau...");
    }

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    public Moto(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindradas=" + cilindradas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}
