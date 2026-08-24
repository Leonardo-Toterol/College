/*Exercicios.Exercicio11();*/

/*Crie uma classe Produto com as properties Nome (string), Preco (double) e Quantidade (int). Depois:

Crie uma List<Produto> com pelo menos 5 produtos
Exiba todos os produtos
Calcule o valor total do estoque (preço × quantidade de cada produto)
Encontre o produto mais caro
Encontre o produto com menor estoque*/
class Program
{
    static void Main(string[] args)
    {
        
            List<Produto> produtos = new List<Produto>
            {
                new Produto {Nome = "Lápis", Preco = 2, Quantidade = 50},
                new Produto {Nome = "Tesoura", Preco = 15, Quantidade = 10},
                new Produto {Nome = "Apontador", Preco = 5, Quantidade = 5},
                new Produto {Nome = "Borracha", Preco = 5, Quantidade = 10},
                new Produto {Nome = "Caderno", Preco = 25, Quantidade = 30}
            };
        
        Console.Clear();
        System.Console.WriteLine("Lista de Produtos: ");
            
        foreach (var item in produtos)
        {
            System.Console.Write(item.Nome + " " + item.Preco + " " + item.Quantidade + " ");
        }

        double total = 0;

        foreach (var item in produtos)
        {
            total += item.Preco * item.Quantidade;
        }
        System.Console.WriteLine();
        System.Console.WriteLine($"O valor total do estoque é R${total}.");

        Produto maisCaro = produtos[0];

        foreach (var item in produtos)
        {
            if (item.Preco > maisCaro.Preco)
            {
                maisCaro = item;
            }
        }
        System.Console.WriteLine($"O produto mais caro é {maisCaro.Nome}.");

        Produto menorEstoque = produtos[0];

        foreach (var item in produtos)
        {
            if (item.Quantidade < menorEstoque.Quantidade)
            {
                menorEstoque = item;
            }
        }

        System.Console.WriteLine($"O produto com menor estoque é {menorEstoque.Nome}.");

    }
}