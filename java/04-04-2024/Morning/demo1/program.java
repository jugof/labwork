class Program{
    public static void main(String[] args) {
        double intallment = Double.parseDouble(args[0]);
        int period = Integer.parseInt(args[1]);

        System.out.printf("The total Amount will be made is : %.2f%n", Investment.futureValue(intallment, period));
    }
};