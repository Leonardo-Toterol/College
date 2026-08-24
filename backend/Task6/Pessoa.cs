public class Pessoa{

    private int Idade;

    public int GetIdade()
    {
        return Idade;
    }

    public void SetIdade(int idade)
    {
        if(idade < 0)
        {
            Console.WriteLine("Idade inválida.");
        }
        else
        {
            Idade = idade;    
        }
        
    }

}