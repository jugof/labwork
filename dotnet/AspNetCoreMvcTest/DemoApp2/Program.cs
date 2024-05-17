using DemoApp.Models;

var builder = WebApplication.CreateBuilder(args);
builder.Services.AddControllersWithViews();
builder.Services.AddTransient<HotelModel>();
var app = builder.Build();
app.MapDefaultControllerRoute();
app.Run();
