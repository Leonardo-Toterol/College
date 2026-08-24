public class Telefone {

    private Integer codigoArea;
    private String numero;
    private String descricao;

    public Telefone() {
    }

    public Telefone(Integer codigoArea, String numero, String descricao) {
        this.codigoArea = codigoArea;
        this.numero = numero;
        this.descricao = descricao;
    }

    public Integer getCodigoArea() {
        return codigoArea;
    }

    public String getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setCodigoArea(Integer codigoArea) {
        this.codigoArea = codigoArea;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "codigoArea=" + codigoArea +
                ", numero='" + numero + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
