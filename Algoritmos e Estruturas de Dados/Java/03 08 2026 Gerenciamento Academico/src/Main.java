
void main() {

    Professor professor = new Professor("Jorge", "esse");

    Aluno aluno = new Aluno("Lucas", "sim");
    Aluno aluno2 = new Aluno("Leo", "esse");

    Turma turma = new Turma("1001", professor);

    turma.inserirAluno(aluno);
    turma.inserirAluno(aluno2);

    professor.logar();
    aluno.logar();

    turma.listarAlunos();
}
