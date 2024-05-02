namespace Payroll
{
    public abstract class Loan
    {
        public double principle { get; set; }

        public double period { get; set; }

        public Loan(double p, double pr)
        {
            principle = p;
            period = pr;
        }
        public abstract double GetRate();
        public double GetEMI()
        {
            double r = GetRate();
            return principle * (1 + r * period / 100) / (12 * period);
        }
    }
    
}