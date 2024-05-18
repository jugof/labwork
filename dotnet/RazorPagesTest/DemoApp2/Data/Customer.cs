using System.ComponentModel.DataAnnotations.Schema;
using DemoApp.Date;

namespace DemoApp.Data;

[Table("CustomerInfo")]
public class Customer
{
    [Column("UserName")]
    public string Id { get; set; }

    public string Password { get; set; }

    public List<Order> Orders { get; set; }
}