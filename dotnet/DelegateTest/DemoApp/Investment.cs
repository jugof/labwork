namespace DemoApp;

delegate double InterestRate(int period);

class Investment(double installment, int duration)  
{
    public double FutureValue(InterestRate rate){
        double i = rate(duration); 
        Console.WriteLine("Inside FutureValue method printing value of i : {0}", i);
        return (installment + duration);
    }
}