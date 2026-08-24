void main() {


    MeuVetor vetor = new MeuVetor(3);

    vetor.adicionar(3);
    vetor.adicionar(5);
    vetor.adicionar(7);
    vetor.adicionar(9);
    vetor.adicionar(11);

    vetor.listarVetor();

    vetor.remover(2);

    vetor.listarVetor();

    vetor.adicionarNoIndice(2, 69);

    vetor.listarVetor();

    vetor.adicionar(5);

    vetor.listarVetor();

    vetor.removerPorValor(5);

    vetor.listarVetor();

    vetor.contem(69);
    vetor.contem(111);
}
