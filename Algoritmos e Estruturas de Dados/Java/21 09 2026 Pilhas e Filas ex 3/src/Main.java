
public class Main{
    public static void main(String[] args){

        Pilha pilha = new Pilha("(" , ")" , "(" , ")");

        Pilha pilha2 = new Pilha("(" , ")" , "[" , "]" , "]");

        Pilha pilha3 = new Pilha("(" , ")" , "[" , "{" , "]", "}");

        Pilha pilha4 = new Pilha("(" , ")" , "[" , "]" , "{" , "}");


        pilha.getTamanho();
        pilha.balanceado();

        pilha2.getTamanho();
        pilha2.balanceado();

        pilha3.getTamanho();
        pilha3.balanceado();

        pilha4.getTamanho();
        pilha4.balanceado();

    }
}
