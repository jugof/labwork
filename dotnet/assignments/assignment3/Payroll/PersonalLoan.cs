namespace Payroll{

    class PersonalLoan : Loan
    {
        double lowerlimit = 100000;
        double higherlimit = 1000000;
        public PersonalLoan(double principle, double period) : base(principle, period)
        {
        }
        public override double GetRate(){
            
            double rate = principle > 500000 ? 0.16 : 0.15;
            if(principle > lowerlimit){
                rate = rate+0.01;
                return rate;
            }
            if(principle > higherlimit){
                rate = rate+0.02;
            }
            return rate;
        }

        
    }

}