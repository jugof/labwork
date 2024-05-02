class Math
{
    private static bool isPrime(int a){
        if(a == 0 || a == 1 ){
            return false;
        }
        if(a == 2){
            return true;
        }
        for(int i=2; i<a; ++i){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int countPrimes(int a, int b){
        int count=0;
        if(a > b){
            return count;
        }
        for (int i = a; i <= b; ++i)
        {
            if(isPrime(i) == true){
                ++count;
            }
        }
        return count;
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int subtract(int a, int b){
        return b - a;
    }

    public static int multiply(int a, int b){
        return a * b;
    }
}