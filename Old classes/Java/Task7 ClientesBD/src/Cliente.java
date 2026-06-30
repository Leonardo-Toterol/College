public class Cliente {
    String nome;
    String cpf;
    double saldo;

    public Cliente(){

    }

    public Cliente(String nome, String cpf, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}




