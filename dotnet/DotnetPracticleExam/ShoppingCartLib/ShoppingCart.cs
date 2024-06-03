using System.Runtime.CompilerServices;

namespace ShoppingCartLib;

public class ShoppingCart
{
    private List<Item> items;

    private long cartPrice;

    // parameerless constructor
    public ShoppingCart()
    {
        
    }

    // adding the List of Items into the Shopping cart
    public ShoppingCart(List<Item> items)
    {
        this.items = items;
    }

    public ShoppingCart(Item itemRef)
    {
        items.Add(itemRef);
    }

    // adding single item into the cart
    public void addItem(Item itemRef)
    {
        items.Add(itemRef);
    }

    public long getCartPrice(){
        // calculating the total price of the Cart
        foreach(Item item in items){
            cartPrice += item.SellingPrice();
        }
        // applyuin discount for casrtPrice if its more than 100000 repees
        if(cartPrice > 100000){
            cartPrice = cartPrice - (cartPrice * 10 / 100);
        }
        // applying discount for cartPrice that is more than 50000 rupees
        else if(cartPrice > 50000){
            cartPrice = cartPrice - (cartPrice * 5 / 100);
        } 
        return cartPrice;
    }

    // To overload [] sqaure brackets operator Struct type is mendatory and operator
    // has to be declaired as public static with struct Name and keyword operator
    // has to implement get/set methods of the operator 

    // public ShoppingCart operator -(Item itemRef)
    // {
    //     // implement the logic for removing the item from the cart
    //     ShoppingCart obj = this;
    //     obj.items.Remove(itemRef);
    //     return obj;
    // }

    // public static ShoppingCart operator this[ShoppingCart cart]
    // {
    //     get{
    //         return cart;
    //     }
    //     set{
    //         cart.items.Clear();
    //     } 
}