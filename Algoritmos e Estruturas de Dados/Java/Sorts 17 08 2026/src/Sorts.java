public class Sorts {



    public static void BubbleSort(int[] vetor){

        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {

                if (vetor[j] > vetor[j + 1]){
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void SelectionSort(int[] vetor){

        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            int menorElemento = i;

            for (int j = i + 1; j < n; j++) {
                System.out.println(vetor[j]);

                if (vetor[j] < vetor[menorElemento]) {
                    menorElemento = j;
                }
            }
            int temp = vetor[menorElemento];
                vetor[menorElemento] = vetor[i];
                vetor[i] = temp;
        }
    }

    public static  void InsertionSort(int[] vetor){
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int key = vetor[i]; // Elemento chave
            int j = i - 1;
            // Desloca elementos maiores
            while (j >= 0 && vetor[j] > key) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = key; // Insere na posição
        }
    }

}
