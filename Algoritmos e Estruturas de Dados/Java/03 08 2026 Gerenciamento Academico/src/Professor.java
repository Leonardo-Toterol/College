public class Professor extends Pessoa {

    public Professor(String nome, String email) {
        super(nome, email);
    }

    @Override
    public void logar() {
        System.out.println("Professor " + getNome() + " logado.");
    }
}
