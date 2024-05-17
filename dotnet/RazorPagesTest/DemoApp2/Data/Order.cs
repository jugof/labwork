using System.ComponentModel.DataAnnotations.Schema;

namespace DemoApp.Date;

[Table("OrderDetails")]
public class Order
{
    [Column("OrderNo")]
    public int Id { get; set; }

    public DateTime OrderDate  { get; set; }

    public string CustomerId { get; set; }

    public int ProductNo { get; set; }

    public int Quantity { get; set; }
}