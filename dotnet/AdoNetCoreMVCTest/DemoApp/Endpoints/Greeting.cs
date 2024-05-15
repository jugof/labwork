namespace DemoApp.Endpoints;

public static class Greeting
{
    public static async Task Welcome(HttpResponse response)
    {
        await response.WriteAsync($"""
        <html>
            <head>
                <title>Not-YOUR-App</title>
            </head>
            <body>
                <h1>Welcome Idiot </h1>
                <b> Current time : </b>{DateTime.Now}
            </body>
        </html>
        """);
    }

    public static async Task Hello(HttpContext context)
    {
        string visitor = context.Request.Form["guest"];
        if(visitor.Length == 0)
            visitor = "Visitor";
        int count = context.Session.GetInt32(visitor) ?? 1;
        context.Session.SetInt32(visitor, count + 1);
        await context.Response.WriteAsync($"""
        <html>
            <head>
                <title>Fuck-Demo</title>
            </head>
            <body>
                <h1>Hell-no {visitor}</h1>
                <b>Number of Greetngs: </b>{count}
            </body>
        </html>
        """);
    }
}