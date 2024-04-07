class MathUtil{

    private int number1;
    private int number2;

    public MathUtil(int n1, int n2){
        number1 = n1;
        number2 = n2;
    }

    private boolean isPrime(int num){
        if(num == 0 || num == 1){
            return false;
        }

        if(num == 2 || num == 3 || num == 5){
            return true;
        }

        if((num % 2) == 0){
            return false;
        }
        return true;
    }

    public int countPrime(){
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

    public int add(){
        return number1 + number2;
    }

    public int subtract(){
        return number2 - number1;
    }

    public int multiply(){
        return number1 * number2;
    }
}