using DemoApp.Data;
using DemoApp.Models;
using Microsoft.AspNetCore.Mvc;

namespace DemoApp.Controllers;


public class HomeController(HotelModel hotel) : Controller
{
    public IActionResult Index()
    {
        var visitors = hotel.ReadVisitors();
        return View(visitors);
    }

    [HttpPost]
    public IActionResult Register(string visitorId, int VisitorRating)
    {
       var guest = new Guest { Id = visitorId, Rating = VisitorRating };
       hotel.WriteVisitor(guest);
       return RedirectToAction("Index"); 
    }
}