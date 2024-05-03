using Payroll;

class Program
{   
    public static void Main()
    {
        Loan[] L = new Loan[]
        {
            new PersonalLoan(400000, 16),
            new HomeLoan(200000, 9),
            new PersonalLoan(126900, 10),
            new HomeLoan(842003, 4),
            new PersonalLoan(5349055, 5),
            new HomeLoan(897643, 3)
        };
        foreach(var loan in L)
        {
            double emi = loan.GetEMI();
            if(loan is ITaxable tax)
            {
                Console.WriteLine($"Calculated EMI for the Personal Loan : {emi:0.00}, and Tax is: {tax.getTax():0.00}");
            }

            if(loan is Discountable discount)
            {
                Console.WriteLine($"Calculated EMI for the Home Loan : {emi:0.00}, and Discount is: {discount.getDiscount():0.00}");
            }

        }

    }

}