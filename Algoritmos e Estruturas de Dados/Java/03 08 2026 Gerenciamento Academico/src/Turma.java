public class Turma {

    private static int proximoId = 1;
    private int id;
    private String nome;
    private Professor professor;
    private Aluno[] alunos;

    public Turma(String nome, Professor professor) {
        this.id = proximoId++;
        this.nome = nome;
        this.professor = professor;
        this.alunos = new Aluno[10];
    }

    public void inserirAluno(Aluno aluno) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                alunos[i] = aluno;
                return;
            }
        }
        System.out.println("Sem vagas na Turma.");
    }

    public void listarAlunos() {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                System.out.println("Aluno " + alunos[i].getNome() + ", Email: " + alunos[i].getEmail());
            }
        }
    }
}