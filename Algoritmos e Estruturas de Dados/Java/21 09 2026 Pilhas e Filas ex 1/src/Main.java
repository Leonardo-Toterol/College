import java.util.Random;

public class Main {

    public static void main(String[] args){


        Random random = new Random();

        Pilha pilhaPar = new Pilha(10);
        Pilha pilhaImpar = new Pilha(10);


        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = random.nextInt(10);
            System.out.println("O número é " + numeroAleatorio);

            if (numeroAleatorio == 0){
                if (!pilhaPar.estaVazia()){
                    pilhaPar.desempilhar();
                }
                else {
                    System.out.println("A pilha está vazia.");
                    System.out.println();
                }

                if (!pilhaImpar.estaVazia()){
                    pilhaImpar.desempilhar();
                }
                else {
                    System.out.println("A pilha está vazia");
                }


            } else if (numeroAleatorio % 2 == 1) {
                System.out.println(numeroAleatorio + " é impar");
                pilhaImpar.empilhar(numeroAleatorio);
                pilhaImpar.verPilha();
                System.out.println();
            } else {
                System.out.println(numeroAleatorio + " é par");
                pilhaPar.empilhar(numeroAleatorio);
                pilhaPar.verPilha();
                System.out.println();
            }
        }

        pilhaPar.verPilha();
        pilhaImpar.verPilha();

        while (!pilhaPar.estaVazia()){
            int numero = pilhaPar.desempilhar();
            System.out.println("Removendo o número " + numero);
        }

        while (!pilhaImpar.estaVazia()){
            int numero = pilhaImpar.desempilhar();
            System.out.println("Removendo o número " + numero);
        }



    }
}
