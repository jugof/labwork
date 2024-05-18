using Grpc.Core;
using Sales;
using ServerApp.Data;

namespace ServerApp.Services;

public class OrderManagerService : OrderManager.OrderManagerBase
{
    public override async Task<OrderStatus> PlacaOrder(OrderInput request, ServerCallContext context)
    {
        using var db = new ShopDbContext();
    }
}