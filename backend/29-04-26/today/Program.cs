var builder = WebApplication.CreateBuilder(args);
var app = builder.Build();

app.MapGet("/", () => "Minha API - Minimal com Net 10");

app.MapGet("/status", () => new
{
    status = "online",
    mensagem = "Api está funcionando!",
    dataHora = DateTime.Now
});

List<Produto> produtos = new List<Produto>
{
    new Produto {Id = 1, Nome = "Produto A", Preco = 10.99m, Ativo = true},
    new Produto {Id = 2, Nome = "Produto C", Preco = 13.99m, Ativo = true},
};

app.MapGet("/produtos", () =>
{
    return Results.Ok(produtos);
});

app.MapGet("/produtos/{id:int}", (int id) =>
{
    Produto? produto = null;
    for (int i = 0; i < produtos.Count; i++)
    {
        if ( produtos[i].Id == id)
        {
            produto = produtos[i];
        }
    }
        if (produto == null)
        {
            return Results.NotFound(); 
        }
        else
        {
            return Results.Ok(produto);
        }
    }
);

app.Run();
