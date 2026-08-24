public class Celular {

    private String marca;
    private String modelo;
    private Bateria bateria;

    public Celular(String marca) {
        this.marca = marca;
    }

    public Celular(String marca, String modelo, Bateria bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Celular{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", bateria=" + bateria.toString() +
                '}';
    }

    public void usarCelular(int consumo){
        this.bateria.gastarBateria(consumo);


    }

    public void carregarCelular() {
        this.bateria.carregarBateria(); // This calls the no-arg battery method
        System.out.println("Carga completa.");
    }

    public void carregarCelular(int quantidade){
        this.bateria.carregarBateria(quantidade);
        System.out.println("Carga completa.");

    }

}
