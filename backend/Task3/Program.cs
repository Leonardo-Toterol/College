/*Comece com um saldo inicial (ex: R$ 1000.00).
O menu (Ver Saldo, Depositar, Sacar, Sair) deve ser exibido repetidamente até que o usuário escolha "Sair" (Dica: do-while ou while).
Use um switch para tratar a opção escolhida.
Na opção "Sacar", use um if para verificar se há saldo suficiente.
Na opção "Depositar", peça um valor e atualize o saldo.
Mostre mensagens claras para cada operação.
*/

decimal saldo = 1000.00m;
int opcao = 0;

do
{
    Console.Clear();
    Console.WriteLine("--- Banco Ulbra ---");
    Console.WriteLine("1 - Ver Saldo\n2 - Depositar\n3 - Sacar\n4 - Sair\n");
    Console.Write("\nEscolha uma opção: ");

    if (!int.TryParse(Console.ReadLine(), out opcao)) continue;

    switch (opcao)
    {
        case 1:
            Console.WriteLine($"\nSeu saldo atual é de R${saldo}");
            break;

        case 2:
            Console.Write("\nDigite o valor para depositar: R$ ");
            decimal deposito = decimal.Parse(Console.ReadLine());
            if (deposito > 0)
            {
                saldo += deposito;
                Console.WriteLine($"Você depositou R${deposito}.");
            }
            else
            {
                Console.WriteLine("Valor inválido.");
            }
            break;

        case 3:
            Console.Write("\nDigite o valor que deseja sacar: R$ ");
            decimal saque = decimal.Parse(Console.ReadLine());

            if (saldo - saque > 0)
            {
                saldo -= saque;
                Console.WriteLine($"Você sacou R${saque}.");
            }
            else if (saque > saldo)
            {
                Console.WriteLine("Erro: Saldo insuficiente.");
            }
            else
            {
                Console.WriteLine("Valor inválido.");
            }
            break;

        case 4:
            Console.WriteLine("\nEncerrando sistema... Obrigado!");
            break;

        default:
            Console.WriteLine("\nOpção inválida! Tente novamente.");
            break;
    }

    if (opcao != 4)
    {
        Console.WriteLine("\nPressione qualquer tecla para voltar ao menu...");
        Console.ReadKey();
    }

} while (opcao != 4);