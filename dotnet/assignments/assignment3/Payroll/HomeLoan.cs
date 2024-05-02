namespace Payroll
{
    class HomeLoan : Loan
    {
      public HomeLoan(double principle, double period) : base(principle, period) 
      {
      }
      public override double GetRate(){
          double rate = principle > 2000000 ? 0.11 : 0.1;
          return rate;
      }
      
    }

}