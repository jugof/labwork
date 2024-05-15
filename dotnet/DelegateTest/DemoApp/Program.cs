namespace DemoApp;

class Program
{

    static double SafeSchema(int y){
        return y < 3 ? 6 : 7.5;
    }

    static void Main(string[] args)
    {

        double installment = 1000;
        int duaration = 10;
        var myinv =  new Investment(installment, duaration);
        
        double ans = myinv.FutureValue(SafeSchema);
        Console.WriteLine("{0:0.00}", ans);

        
        Console.WriteLine("calling method of deligate ussing lambda expression :{0} ", myinv.FutureValue(y => y < 3 ? 3 : 2) );
      


        // Console.WriteLine("Hello, World!");
    }
}
