
void main() {

    Livro l1 = new Livro("A Bela e a Fera", "Shakespeare", 350, true);
    Livro l2 = new Livro("Avengers", "Eu mesmo", 300, true);
    Livro l3 = new Livro("Homem Aranha", "Miles Morales", 824, true);

    Livraria livraria = new Livraria();

    livraria.inserirLivro(l1);
    livraria.inserirLivro(l2);
    livraria.inserirLivro(l3);

    livraria.listarLivros();

    l1.reservar();

    livraria.listarDisponiveis();

    l1.devolver();

    livraria.listarDisponiveis();


}
