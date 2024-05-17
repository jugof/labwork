using DemoApp.Services;

var builder = WebApplication.CreateBuilder(args);
builder.Services.AddRazorPages(); 
builder.Services.AddSingleton<ICounter, CommonCounter>();
var app = builder.Build();
app.MapRazorPages();
app.Run();
