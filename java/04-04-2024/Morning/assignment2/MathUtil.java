class MathUtil{

    private static boolean isPrime(int num){
        if(num == 0 || num == 1){
            return false;
        }

        if((num % 2) == 0){
            return false;
        }
        return true;
    }

    public static int countPrime(int number1, int number2){
        if(number2 < number1){
            return 0;
        }
        int count=0;
        for(int i=number1; i<=number2; i++){
            if(isPrime(i)){
                ++count;
            }
        }
        return count;
    }

    public static int add(int number1, int number2){
        return number1 + number2;
    }

    public static int subtract(int number1, int number2){
        return number2 - number1;
    }

    public static int multiply(int number1, int number2){
        return number1 * number2;
    }
}