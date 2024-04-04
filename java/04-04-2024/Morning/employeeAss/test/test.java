

class Investment {

    private int a;

    public Investment(int x){
        a = x;
    }

    public int getVal(){
        return a;
    }

    public static double futureValue(double installment, int duration, boolean risk) {

        double i = risk ? 0.08 : 0.06;
        
        return (installment / i) * (Math.pow(1 + i, duration) - 1);
    }

}

class Program {

    public static void main(String[] args) {

        Investment obj = new Investment(10);

        double p = 1000;

        int n = 10;

        System.out.printf("getVal on obj => %d%n ", obj.getVal());
        // System.out.printf("future val on obj => %d%n", obj.futureValue(p, n, true));

        System.out.printf("Future value in risk-free investment:  %.2f%n", Investment.futureValue(p, n, false));
        
    }

}