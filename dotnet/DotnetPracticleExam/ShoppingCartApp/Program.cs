// See https://aka.ms/new-console-template for more information

using ShoppingCartLib;

// Creating List of Items(Id, Price, Quantity) basis
List<Item> items = new List<Item>{
    new Item(101, 5000, 10),
    new Item(102, 10, 1),
    new Item(103, 10, 1),
    new Item(104, 100, 10)
    };

// Adding Itmes List to Shopping Cart
ShoppingCart cart = new ShoppingCart(items);

Console.Write("Total Cart Price is: ");
Console.WriteLine(cart.getCartPrice());

// Adding single item to the Cart 
cart.addItem(new Item(11, 77, 2));

