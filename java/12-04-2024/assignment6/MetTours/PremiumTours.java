package MetTours;

public class PremiumTours 
{
    public double getDaysRentCommon(int days, int noPersons)
    {
        double rent = 1200 * days * noPersons;
        if (days > 6)
        {
            rent = rent-100 * days * noPersons;
        }

        if(noPersons >=4)
        {
            rent = rent - 100 * days * noPersons;
        } 
        return rent;
    }   
    
    public double getRentSeniors(int days, int noPersons)
    {
        return getDaysRentCommon(days, noPersons) -100;
    }

    public double getRentWoman(int days, int noPersons)
    {
        return getDaysRentCommon(days, noPersons) -200;
    }
}
