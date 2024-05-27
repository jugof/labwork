namespace Tourism;

public class PremuimTour(int days, int noPersons)
{
    
    public double getDaysRentForCommon()
    {
        int rentPerDay = 1200;
        if(days > 6 || noPersons >= 4){
            rentPerDay -= 100; 
        }

        if(days > 6 && noPersons >= 4){
            rentPerDay -= 100; 
        }
        double totalRent = days * noPersons * rentPerDay;
        
        return totalRent;
    }

    public double getDaysRentForSeniors()
    {
        int rentPerDay = 1100;
        if(days > 6 || noPersons >= 4){
            rentPerDay -= 100; 
        }
        
        if(days > 6 && noPersons >= 4){
            rentPerDay -= 100; 
        }
        double totalRent = days * noPersons * rentPerDay;
        
        return totalRent;
    }

    public double getDaysRentForWoman()
    {
        int rentPerDay = 1000;
        if(days > 6 || noPersons >= 4){
            rentPerDay -= 100; 
        }
        
        if(days > 6 && noPersons >= 4){
            rentPerDay -= 100; 
        }
        double totalRent = days * noPersons * rentPerDay;
        
        return totalRent;
    }
}