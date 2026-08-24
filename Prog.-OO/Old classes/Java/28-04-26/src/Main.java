
void main() {
    menu();
}

    public void listar(ArrayList <Contato> numeros){
        for (int i = 0; i < numeros.size(); i++) {
            IO.println(numeros.get(i));
            
        }
    }

    public void adicionarContato(ArrayList <Contato> contatos){
        String nome = IO.readln("Qual o nome? ");
        String email = IO.readln("Qual o email");

        Contato contato = new Contato(nome, email);

        contatos.add(contato);
        IO.println("Contato adicionado.");
    }

    public void adicionarTelefone(ArrayList <Telefone> numeros){
        Integer codigoArea = Integer.parseInt(IO.readln("Qual o código de Area?"));
        String numero = IO.readln("Qual o número?");
        String descricao = IO.readln("Pessoal ou Trabalho?");

        Telefone telefone = new Telefone(codigoArea, numero, descricao);

        numeros.add(telefone);
        IO.println("Telefone adicionado.");
    }

    public void adicionar(ArrayList <Contato> contatos, ArrayList <Telefone> numeros){
        int r;

    do {
        IO.println("O que você deseja adicionar?\n1°Contato\n2°Telefone\n3° Retornar");
        r = Integer.parseInt((IO.readln()));

        switch (r) {
            case 1:
                adicionarContato();
                break;

            case 2:
                adicionarTelefone();
                break;

            case 3:
                break;

        }
    }while (r != 3);
}


    public int menu(){
        int r;

    do{
        IO.println("\nMenu\n\n1° Adicionar\n2° Remover\n3° Editar\n4° Listar\n0 Sair\n");
        r = Integer.parseInt((IO.readln()));

        switch (r) {
            case 1:
                adicionar();
                break;

            case 2:

                break;

            case 3:

                break;

            case 4:
                listar(Contato);
                break;

            case 0:
                IO.println("Encerrando...");
                IO.println(numeros);
                break;

            }
        }while (r != 5);
            return r;
}





