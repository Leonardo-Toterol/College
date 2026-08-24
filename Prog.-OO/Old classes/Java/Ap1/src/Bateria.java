public class Bateria {

    private Integer porcentagemAtual;
    private Integer capacidadeMah;

    public Bateria(){
        this.porcentagemAtual = 60;
    }

    public Bateria(Integer porcentagemAtual, Integer capacidadeMah) {
        this.porcentagemAtual = porcentagemAtual;
        this.capacidadeMah = capacidadeMah;
    }

    public Integer getPorcentagemAtual() {
        return porcentagemAtual;
    }

    public Integer getCapacidadeMah() {
        return capacidadeMah;
    }

    public void setPorcentagemAtual(Integer porcentagemAtual) {
        this.porcentagemAtual = porcentagemAtual;
    }

    public void setCapacidadeMah(Integer capacidadeMah) {
        this.capacidadeMah = capacidadeMah;
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "Bateria{" +
                "porcentagemAtual=" + porcentagemAtual +
                ", capacidadeMah=" + capacidadeMah +
                '}';
    }

    public void carregarBateria() {
        this.porcentagemAtual = 100;
    }

    public void carregarBateria(int quantidade) {
        this.porcentagemAtual += quantidade;
        if(this.porcentagemAtual > 100) this.porcentagemAtual = 100;
    }

    public void gastarBateria(int consumo){
        if (consumo >= this.porcentagemAtual){
            this.porcentagemAtual = 0;
            System.out.println("A bateria esta descarregada.");
        } else if (consumo < 0){
            System.out.println("Não é permitido consumo negativo.");
        } else {
            this.porcentagemAtual -= consumo;

        }


    }

}
