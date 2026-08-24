public class Carro extends Veiculo {

    int numeroPortas;


    public void ligarRadio(){
        System.out.println("Tocando as melhores Summer 2026!");
    }

    public Carro() {
    }

    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    public Carro(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "numeroPortas=" + numeroPortas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}


