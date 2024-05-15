using System.ComponentModel.DataAnnotations;
using DemoApp.Services;
using Microsoft.AspNetCore.Mvc;

namespace DemoApp.Controllers;

[ApiController]
public class BackController : ControllerBase
{
    [HttpPut("/greet")]
    public ActionResult<GreetOutput> Greet(GreetInput guest, ICounter counter)
    {
        return new GreetOutput
        {
            Message = guest.age < 20 ? $"Hi {guest.Name}" : $"Hello {guest.Name}",
            Count = counter.CountNext(guest.Name)
        };
    }

    public class GreetInput
    {
        [StringLength(32, MinimumLength = 4)]
        public string Name { get; set; }

        [Range(16, 69)]
        public int age { get; set; }
    }

    public class GreetOutput
    {
        public string Message { get; set; }

        public int Count { get; set; }
    }
}