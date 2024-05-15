class Program
{
    public static bool isEven(int num){
        if(num % 2 == 0){
            return true;
        }
        return false;
    }

    public static bool isOdd(int num){
        if(num % 2 == 1){
            return true;
        }
        return false;
    }

    public static bool isPrime(int num){
        if(num == 0 || num == 1){
            return false;
        }
        if(num == 2){
            return true;
        }
        for(int i=2; i<num; ++i){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void Main(string[] args){

        int lower = int.Parse(args[0]);
        int higher = int.Parse(args[1]);

        DelegateCheck dc = new DelegateCheck(lower, higher);
        int ans = dc.TotalSum(isPrime);
        Console.WriteLine("Total Sum of all Prime Numbers from {0} to {1} is=> {2} ", lower, higher, ans);

        DelegateCheck odd = new DelegateCheck(lower, higher);
        ans = odd.TotalSum(isOdd);
        Console.WriteLine("Total Sum of all Odd Numbers from {0} to {1} is  => {2} ", lower, higher, ans);

        DelegateCheck even = new DelegateCheck(lower, higher);
        ans = dc.TotalSum(isEven);
        Console.WriteLine("Total Sum of all Even Numbers from {0} to {1} is => {2} ", lower, higher, ans);


    }
}