class Program {

    public static void main(String[] args){

        MathUtil obj = new MathUtil(5, 15);
        
        System.out.printf("Count of Prime numbers betweeen 1 to 10 is : %d%n", obj.countPrime());

        System.out.printf("addition of A and B is                     : %d%n", obj.add());

        System.out.printf("Substraction of A and B is                 : %d%n", obj.subtract());

        System.out.printf("Multiplication of A and B                  : %d%n", obj.multiply());
    }
}