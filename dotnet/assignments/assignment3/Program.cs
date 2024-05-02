using Payroll;

class Program
{
    public static void Main(){
        Loan a = new PersonalLoan(1200, 1);
        Loan[] arr = new Loan[10];
        arr[0] = new PersonalLoan(123000, 15);
        arr[1] = new HomeLoan(230004.69, 12);
    }
}