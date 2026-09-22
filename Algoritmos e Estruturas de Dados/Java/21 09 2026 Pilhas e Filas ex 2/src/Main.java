import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        int c = 0;
        boolean palindromo = true;

        System.out.println("A palavra é - " + palavra);

        for (int i = 0; i < palavra.length() / 2; i++) {
            c ++;
            if (palavra.charAt(i) == palavra.charAt(palavra.length()-c)) {

                System.out.print(palavra.charAt(i) + " é igual a ");
                System.out.println(palavra.charAt(palavra.length() - c));
                System.out.println();
            }
            else {
                System.out.print(palavra.charAt(i) + " não é igual a ");
                System.out.println(palavra.charAt(palavra.length() - c));
                System.out.println();
                palindromo = false;
                break;
            }
        }

        if (palindromo){
            System.out.println(palavra + " é um palíndromo.");
        }
        else {
            System.out.println(palavra + " não é um palíndromo.");
        }
    }
}
