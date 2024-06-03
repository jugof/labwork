namespace ShoppingCartLib;

public class Item
{
    private long id;

    private long costPerUnit;

    private long qty;

    public Item()
    {
        
    }

    // parameterised constructor initilizing Item
    public Item(long id, long costPerUnit, long qty)
    {
        this.id = id;
        this.costPerUnit = costPerUnit;
        this.qty = qty;
    }

    // to get selling price of item depending upon quantity
    public long SellingPrice(){
        return costPerUnit * qty;
    }
    
    // to set Id of Item
    public void setId(long id){
        this.id = id;
    }

    // To get Item Id
    public long getId(){
        return id;
    }
}
