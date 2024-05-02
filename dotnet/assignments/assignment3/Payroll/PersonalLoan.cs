namespace Payroll{

    class PersonalLoan : Loan
    {
        public PersonalLoan(double principle, double period) : base(principle, period)
        {
        }
        public override double GetRate(){
            double rate = principle > 500000 ? 0.16 : 0.15;
            return rate;
        }
        
    }

}