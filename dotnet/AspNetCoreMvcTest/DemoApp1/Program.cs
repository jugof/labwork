using DemoApp.Services;

var builder = WebApplication.CreateBuilder(args);
builder.Services.AddControllers();
builder.Services.AddTransient<ICounter, NamedCounter>();

var app = builder.Build();

app.UseStaticFiles();
app.MapControllers();

app.Run();
