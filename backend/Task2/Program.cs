// See https://aka.ms/new-console-template for more information
Console.WriteLine("Digite o primeiro número: ");
string resposta_1 = Console.ReadLine();

Console.WriteLine("Digite o segundo número: ");
string resposta_2 = Console.ReadLine();

int numero_1  = Convert.ToInt32(resposta_1);
int numero_2  = Convert.ToInt32(resposta_2);

Console.WriteLine("O resultado de " + numero_1 + " + " + numero_2 + " é: " + (numero_1 + numero_2));
Console.WriteLine($"O resultado de {numero_1} - {numero_2} é: {numero_1 - numero_2}");
Console.WriteLine(string.Format("O resultado de {0} * {1} é: {2}", numero_1, numero_2, numero_1 * numero_2));
Console.WriteLine(string.Format("O resultado de {0} / {1} é: {2}", numero_1, numero_2, numero_1 / numero_2));

