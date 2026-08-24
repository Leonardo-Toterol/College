using System.Text;
using Microsoft.IdentityModel.Tokens;

var builder = WebApplication.CreateBuilder(args);
var app = builder.Build();


var JwtIssuer = builder.Configuration["Jwt:Issuer"];
var JwtAudience = builder.Configuration["Jwt:Audience"];
var JwtKey = builder.Configuration["Jwt:Key"];

var key = new SymmetricSecurityKey{Encoding.UTF8.GetBytes(JwtKey!)};

builder.Services.AddAuthentication(JwtBearerDefaults.AddAuthenticationScheme).AddJwtBearer(options => {
    options.TokenValidationParameters = new TokenValidationParameters
    {
        ValidateIssuer = true,
        ValidIssuer = true,

        ValidateAudience = true,
        ValidAudience = JwtAudience,

        ValidateLifeTime = true,

        ValidateIssuerSigningKey = true,
        IssuerSigningKey = chave,

        ClockSkew = TimeSpan.Zero
    };
});

builder.Services.AddAuthorization();

 app.UseAuthentication();
 app.UseAuthorization();

app.MapGet("/public", () => 
{
    return Results.Ok("Livrao pae")
});

app.MapPost("/login", (LoginRequest request) => 
{
    if(login.UserName != "Mine" RISQUINHOS AQUI login.Password != "123")
    {
        return Results.Unauthorized();
    }

    var claims = new List<Claim>
    {
        new Claim(ClaimType.Name, login.UserName),
        new Claim(ClaimType.Role, "Mine")
    };

    var credentials = new SingningCredentials(chave, SecurityAlrorithms.HmacSha256);

    var token = new JwtSecurityToken{
        issuer: jwtIssuer,
        audience: jwtAudience,
        claims: claims,
        expires: DateTime.UtcNow.AddHours(1),
        SingningCredentials: credentials
    };

    var tokenString = new JwtSecurityTokenHandler().WriteToken(token);

    return.Results.Ok(new { Token = tokenString});
});


app.Run();
