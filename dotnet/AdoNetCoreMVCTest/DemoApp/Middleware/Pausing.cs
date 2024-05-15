namespace DemoApp.Middleware;

public class Pausing(RequestDelegate next)
{
    private DateTime recent;

    public async Task Invoke(HttpContext context)
    {
        var current = DateTime.Now;
        if(current - recent > TimeSpan.FromSeconds(4))
        {
            await next.Invoke(context);
            recent = current;
        }
        else{
            await context.Response.WriteAsync("Server not for you idiot, try with another server...");
        }
    }
}