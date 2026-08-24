using System.Runtime.InteropServices;

class Exercicios
{
    public static void Exercicio1()
    {
        /*Crie um array de int com 5 notas de alunos (valores à sua escolha). Em seguida, percorra o array com um for e exiba cada nota no console.*/

int[] notas = {8, 7, 4, 7, 10};
int cont = 0;

Console.WriteLine();
for(int i = 0; i < notas.Length; i++)
{
    cont += 1;
    Console.WriteLine($"A {cont}° nota é: {notas[i]}");
}
    }

    public static void Exercicio2()
    {
        /*Crie um array com 6 valores double representando temperaturas de 
uma semana (sem domingo). Calcule e exiba a soma e a média das temperaturas.

Dica: use array.Length para calcular a média.*/


double[] temperaturas = new double[6];
temperaturas[0] = 28;
temperaturas[1] = 31;
temperaturas[2] = 30;
temperaturas[3] = 31;
temperaturas[4] = 32;
temperaturas[5] = 18;

double media = (temperaturas.Sum() /  temperaturas.Length);
Console.WriteLine("\n");
Console.WriteLine($"A media das temperaturas desta semana é {media:F1}°.");
    }

    public static void Exercicio3()
    {
        /*Crie um array de 8 inteiros com valores variados. Percorra o array e encontre o maior e o menor valor, sem usar métodos prontos como Max() ou Min().*/

int[] numeros = {2, 4, 6, 8, 10, 22, 24, 36};

int maior = 0;
int menor = 99;

for(int i = 0; i < numeros.Length; i++)
{
    if(numeros[i] > maior)
    {
        maior = numeros[i];
    }
    if(numeros[i] < menor)
    {
        menor = numeros[i];
    }
}
Console.WriteLine("\n");
Console.WriteLine($"O maior número é: {maior}.\nO menor número é: {menor}.");
    }

    public static void Exercicio4()
    {
        /*Dado o array string[] palavras = { "C#", "é", "muito", "legal" };, exiba os elementos na ordem inversa sem usar Array.Reverse()*/

String[] palavras = { "C#", "é", "muito", "legal" };

Console.WriteLine("\n");
for(int i = 3; i >= 0; i--)
{
    Console.WriteLine(palavras[i]);
}

    }

    public static void Exercicio5()
    {
        /*Crie um array de 10 inteiros. Percorra o array e conte quantos números são pares e quantos são ímpares.*/

int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
int numeros_par = 0;
int numeros_impar = 0;

for(int i = 0; i < numeros.Length; i++)
{
    if(numeros[i] % 2 == 0)
    {
        numeros_par += 1;
    }
    else
    {
        numeros_impar += 1;
    }
}
Console.WriteLine($"Existem {numeros_par} números par e {numeros_impar} números impar neste array.");
    }

    public static void Exercicio6()
    
    {
       /* Crie um programa de lista de compras usando List<string>. O programa deve:

Começar com 3 itens já na lista
Adicionar 2 itens novos com Add()
Remover 1 item com Remove()
Exibir a lista final com foreach
Exibir a quantidade total de itens com Count*/

List<string> estoque = new List<string>{"BANANA", "MAÇA", "PERA"};
Boolean ativo = false;

        while (!ativo)
        {
            Console.Clear();
            Console.WriteLine("Bem vindo ao Estoque\n1° Adicionar item\n2° Remover item\n3° Fechar\n");
            string r = Console.ReadLine();

            switch (r)
            {
                
                case "1":
                Console.WriteLine("Digite o item que deseja adicionar: ");
                string item = Console.ReadLine().ToUpper();

                estoque.Add(item);
                break;

                case "2":
                Console.WriteLine("Digite o item que deseja remover: ");
                string item2 = Console.ReadLine().ToUpper();

                estoque.Remove(item2);
                if (estoque.Remove(item2))
                {
                    Console.WriteLine("Item removido!");
                }
                else
                {
                    Console.WriteLine("Item não encontrado!");
                }
                break;

                case "3":
                foreach(string produto in estoque)
                    {
                        Console.WriteLine(produto);
                    }
                ativo = true;
                break;

            }


        }

    }

    public static void Exercicio7()
    {
        /*Crie uma List<int> com 10 números variados (positivos e negativos). 
        Em seguida, crie duas novas listas: uma apenas com os positivos e outra apenas com os negativos.*/

        List<int> real = new List<int>{1, -4, 7, -2, 5, -3, 8, -9, 10, -6};
        List<int> positivos = new List<int>{};
        List<int> negativos = new List<int>{};

        for(int i = 0; i < real.Count; i++)
        {
            if (real[i] > 0)
            {
                positivos.Add(real[i]);
            }
            else
            {
                negativos.Add(real[i]);
            }
        }
        System.Console.WriteLine("Os números positivos são:");
        for (int i = 0; i < positivos.Count; i++)
        {
            System.Console.WriteLine(positivos[i]);
        }

        System.Console.WriteLine("Os números negativos são: ");
        for (int i = 0; i < negativos.Count; i++)
        {
            System.Console.WriteLine(negativos[i]);
        }
    }

    public static void Exercicio8()
    {
        /*Crie uma nova lista que contenha apenas os nomes sem repetição. Não use Distinct() — faça a lógica manualmente com Contains().*/

        List<string> nomes = new List<string>{ "Ana", "Carlos", "Ana", "Beatriz", "Carlos", "Diana", "Ana" };

        List<String> naoDuplicado = new List<string>{};

        for (int i = 0; i < nomes.Count; i++)
        {
            if (!naoDuplicado.Contains(nomes[i]))
            {
                naoDuplicado.Add(nomes[i]);
            }
        }
        foreach (var item in naoDuplicado)
        {
            System.Console.WriteLine(item);
        }
    }

    public static void Exercicio9()
    {
        /*Crie uma List<string> para armazenar nomes de alunos. Faça um menu interativo no console:*/

        List<String> alunos = new List<string>{};
        Boolean ativo = false;

        do{
            System.Console.WriteLine("\n    Ulbra\n1° Adicionar aluno\n2° Remover aluno\n3° Listar alunos\n4° Buscar aluno por nome\n5° Sair\n");
            int r = int.Parse(System.Console.ReadLine());

            switch (r)
            {
                case 1:
                Console.Clear();
                System.Console.WriteLine("Digite o nome do aluno para adicionar: ");
                String aluno = Console.ReadLine();
                alunos.Add(aluno);
                break;

                case 2:
                Console.Clear();
                System.Console.WriteLine("Digite o nome do aluno para remover: ");
                aluno = Console.ReadLine();
                alunos.Remove(aluno);
                break;

                case 3:
                Console.Clear();
                System.Console.WriteLine("Os alunos atuais são: ");
                foreach (var item in alunos)
                {
                    System.Console.WriteLine(item);
                }
                break;

                case 4:
                Console.Clear();
                System.Console.WriteLine("Digite o nome do aluno para buscar: ");
                aluno = Console.ReadLine();
                Boolean encontrado = false;

                foreach (var item in alunos)
                {
                    if (item == aluno)
                        {
                            System.Console.WriteLine($"O aluno {aluno} está matriculado.");
                            encontrado = true;
                        }
                }
                if (encontrado == false)
                        {
                            System.Console.WriteLine($"O aluno {aluno} não está matriculado.");
                        }
                break;

                case 5:
                Console.Clear();
                System.Console.WriteLine("Fechando o sistema...");
                ativo = false;
                break;

                default:
                    System.Console.WriteLine("Opção inválida, tente novamente.");
                    break;   
            }  
        } while (!ativo);
    }

    public static void Exercicio10()
    {
        /*Crie uma List<int> com 8 números desordenados. Faça o seguinte:

Exiba a lista original
Ordene com Sort()
Exiba a lista ordenada
Peça ao usuário um número e use IndexOf() para informar a posição dele, ou dizer que não existe na lista*/

    List<int> numeros = new List<int>{4, 7, 2, 5, 12, 22, 8, 6};

    System.Console.WriteLine("a lista original é: ");
    foreach (var item in numeros)
    {
        System.Console.Write(item + " ");
    }
    System.Console.WriteLine();
    numeros.Sort();

    System.Console.WriteLine("a lista ordenada é: ");
    foreach (var item in numeros)
    {
        System.Console.Write(item + " ");
    }
    System.Console.WriteLine();
    System.Console.WriteLine("Digite o número para procurar: ");
    int numeroEscolhido = int.Parse(Console.ReadLine());
    int index = numeros.IndexOf(numeroEscolhido);

    if (numeros.Contains(numeroEscolhido))
    {
        System.Console.WriteLine($"A posição do número {numeroEscolhido} na lista é {index}.");
    }
    else
        {
            System.Console.WriteLine("O número não existe na lista.");
        }
    }

    public static void Exercicio11()
    {
        /*Crie um array int[] numeros = { 1, 2, 3, 4, 5 };
Converta para List<int> usando new List<int>(numeros)
Adicione os números 6, 7 e 8 na lista
Converta de volta para array usando ToArray()
Exiba o array final*/

    int[] numeros = { 1, 2, 3, 4, 5 };
    List<int> listaNumeros = new List<int>(numeros);

    listaNumeros.Add(6);
    listaNumeros.Add(7);
    listaNumeros.Add(8);

    int[] arrayNumeros = listaNumeros.ToArray();

    foreach (var item in arrayNumeros)
    {
        System.Console.Write(item + " ");
    }
    }

    public static void Exercicio12()
    {
        
    }
}

