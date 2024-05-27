namespace Tourism;

public class EconomyTour(int days, int noPersons)
{

    public double getEconomyDaysRent()
    {
        return days * noPersons * 500;
    }

}