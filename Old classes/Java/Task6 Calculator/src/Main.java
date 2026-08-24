
void main() {
    Integer numero = 0;
    Integer numero2 = 0;
    String r = "";
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número: ");
    numero = sc.nextInt();

    System.out.print("Digite o operador: ");
    r = sc.next();

    System.out.print("Digite um número: ");
    numero2 = sc.nextInt();

    switch (r) {
        case "+":
            System.out.println("O resultado de " + numero + " + " + numero2 + " é " + (numero + numero2));
            break;

        case "-":
            System.out.println("O resultado de " + numero + " - " + numero2 + " é " + (numero - numero2));
            break;

        case "*":
            System.out.println("O resultado de " + numero + " * " + numero2 + " é " + (numero * numero2));
            break;

        case "/":
            System.out.println("O resultado de " + numero + " / " + numero2 + " é " + (numero / numero2));
            break;
    }
    }