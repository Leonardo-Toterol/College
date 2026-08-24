AP2 API Livros

Uma API simples para gerenciar livros, sendo a entidade principal Livro.

-- Tecnologias utilizadas

C#
ASP.NET Core Minimal API
Entity Framework Core
SQLite

--Como Executar

Executar no terminal: dotnet run

O servidor será iniciado com o ASP.NET

--Endpoints

GET "/" = Título da API.
GET "/status" = Status da API.
GET "/livros" = Lista todos os livros.
GET "/livros/{id}" = Busca um livro pela Id.
POST "/livros" = Cadastra um novo livro.
PUT "/livros/{id}" = Altera um livro.
DELETE "/livros/{id}" = Deleta um livro.

--Exemplo JSON

{
  "nome": "House of The Dragon",
  "autor": "George R Martin",
  "preco": 19.90,
  "disponivel": true,
  "lancamento": "2018-11-20T08:00:00"
}

--link video
https://www.youtube.com/watch?v=Q-qjkRiY2_E