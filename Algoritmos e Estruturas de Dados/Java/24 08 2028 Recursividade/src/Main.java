import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //System.out.println(Recursiva.fatorial(15));
        //0-1-1-2-3-5-8-13-21-34-55-89
        //System.out.println(Recursiva.fibonacci(10));

        int[] vetor = {9, 11, 0, 5, 2, 80, 4, 6};

        Random r = new Random();

        int[] vetor2 = new int[1000000];

        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = r.nextInt(1001);
        }

        int[] vetor3 = vetor2.clone();

        long tempoInicio = System.nanoTime();
        Ordenacao.mergeSort(vetor2, 0, vetor2.length - 1);
        long TempoFim =  System.nanoTime();
        long tempoGasto = (TempoFim - tempoInicio) / 1000;
        System.out.println("Merge Sort: " + tempoGasto);

        tempoInicio = System.nanoTime();
        Ordenacao.quickSort(vetor3, 0, vetor3.length - 1);
        TempoFim =  System.nanoTime();
        tempoGasto = (TempoFim - tempoInicio) / 1000;
        System.out.println("Quick Sort: " + tempoGasto);
//        System.out.println(Arrays.toString(vetor2));
//        System.out.println(Arrays.toString(vetor3));





        // System.out.println(TempoFim - tempoInicio);

        //System.out.println(Arrays.toString(vetor2));
    }
}