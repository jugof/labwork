class Program {

    public static void main(String[] args){

        double hours = Double.parseDouble(args[0]);
        float rate = Float.parseFloat(args[1]);

        Employee a = new Employee(hours, rate);
        Employee b = new Employee();

        b.setHours(180);
        b.setRate(89);


        System.out.printf("Total income for Employee is : %.2f%n", a.income());

        System.out.printf("Total income for Employee is : %.2f%n", b.income());
    }

}