public class Pessoa
{
    public Pessoa(string nome, int idade)
    {
        Nome = nome;
        Idade = idade;
    }
    public string? nome;

    public int idade;

    public void SetTelefone(double numeroTelefone)
    {
        if(numeroTelefone <= 0)
        {
            Console.WriteLine("Número de telefone inválido.");
        }
        else
        {
            Teefone = numeroTelefone;
        }
    }
    public double GetTelefone()
    {
        return Telefone;
    }
    public void Falar()
    {
        Console.WriteLine("$Olá, meu nome é {nome} e tenho {idade} anos.")
    }
}