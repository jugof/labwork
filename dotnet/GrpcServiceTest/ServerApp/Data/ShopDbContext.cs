using Microsoft.EntityFrameworkCore;

namespace ServerApp.Data;

public class ShopDbContext : DbContext
{
    public DbSet<Counter> Counters { get; set; }

    public DbSet<Order> Orders { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        optionsBuilder.UseSqlServer("Data Source=iitdac.met.edu;Database=shop2;User Id=dac2;Password=Dac2@1234;Encrypt=False");
    }

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        modelBuilder.Entity<Order>()
                .ToTable("OrderDetail")
                .Property(p => p.Id)
                .HasColumnName("OrderNo");
    }
}