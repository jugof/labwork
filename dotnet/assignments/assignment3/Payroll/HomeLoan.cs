namespace Payroll
{
    class HomeLoan : Loan, Discountable
    {
      private double limit;
      public HomeLoan(double principle, double period) : base(principle, period) 
      {
        limit = 2500000;
      }
      public override double GetRate(){
          double rate = principle > 2000000 ? 0.11 : 0.1;
          if(principle > limit){
            rate = rate+0.01;
          }
          return rate;
      }
      
      public double getDiscount(){
        return GetEMI() * 0.10;
      }

    }

}