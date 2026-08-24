using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.Options;

var builder = WebApplication.CreateBuilder(args);

builder.Services.AddDbContext<AppDbContext>(Options =>
    Options.UseSqlite("Data Source = livros.db"));

var app = builder.Build();

using (var scope = app.Services.CreateScope())
{
    var db = scope.ServiceProvider.GetRequiredService<AppDbContext>();
    db.Database.EnsureCreated();
}

app.MapGet("/", () => "AP2 API Livros");

app.MapGet("/status", () => new
{
    status = "Online",
    mensagem = "Api está funcionando",
    dataHora = DateTime.Now
});

app.MapGet("/Livros", async (AppDbContext db) =>
{
    var livros = await db.Livros.ToListAsync();

    return Results.Ok(livros);
});

app.MapGet("/livros/{id}", async (int id, AppDbContext db) =>
{
    var livro = await db.Livros.FindAsync(id);

    if (livro == null)
        return Results.NotFound();

    return Results.Ok(livro);
});

app.MapPost("/livros", async (Livro livro, AppDbContext db) =>
{
    db.Livros.Add(livro);

    await db.SaveChangesAsync();

    return Results.Created($"/livros/{livro.Id}", livro);
});

app.MapPut("/livros/{id}", async (int id, Livro livroNovo, AppDbContext db) =>
{
    var livro = await db.Livros.FindAsync(id);

    if (livro == null)
        return Results.NotFound();

    livro.Nome = livroNovo.Nome;
    livro.Autor = livroNovo.Autor;
    livro.Preco = livroNovo.Preco;
    livro.Disponivel = livroNovo.Disponivel;
    livro.Lancamento = livroNovo.Lancamento;

    await db.SaveChangesAsync();

    return Results.Ok(livro);
});

app.MapDelete("/livros/{id}", async (int id, AppDbContext db) =>
{
    var livro = await db.Livros.FindAsync(id);

    if (livro == null)
        return Results.NotFound();

    db.Livros.Remove(livro);

    await db.SaveChangesAsync();

    return Results.NoContent();
});

app.Run();
