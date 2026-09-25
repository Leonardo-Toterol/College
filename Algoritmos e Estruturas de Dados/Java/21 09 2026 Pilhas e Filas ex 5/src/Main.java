public class Main {
    public static void main(String[] args){

        Fila fila = new Fila(3);

        Documento documento = new Documento("Lei 1515");
        Documento documento1 = new Documento("Receita Bolo");
        Documento documento2 = new Documento("Curriculo Rafael");

        fila.enfileirar(documento);
        fila.enfileirar(documento1);
        fila.enfileirar(documento2);

        fila.desenfileirar();
        fila.desenfileirar();
        fila.desenfileirar();
        fila.desenfileirar();

        /*
        Implemente uma fila para simular uma fila de impressão de documentos. Cada documento tem um nome e um número de páginas.

Crie a fila e insira alguns documentos nela.
Remova os documentos da fila um por um, simulando a impressão (exibindo o nome do documento e o número de páginas).
A cada duas impressões informe os dados do próximo documento.
Ao final da simulação:
Exiba os dados do documento com maior número de páginas;
Exiba o número total de páginas impressas.
         */
    }
}
