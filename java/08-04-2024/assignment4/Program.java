import loan.HomeLoan;
import loan.LoanClass;
import loan.PersonalLoan;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        LoanClass k = new PersonalLoan(123000, 3);
        k.setPrinciple(120000);
        k.setPeriod(12);
        
        LoanClass[] lc = new LoanClass[5];
        lc[0] = new HomeLoan(9000112, 22);
        lc[1] = new PersonalLoan(1231122, 12);
        lc[2] = new HomeLoan(7480090, 8);
        lc[3] = new PersonalLoan(1320003, 19);
        lc[4] = new HomeLoan(412300, 7);

        for(int i= 0; i<5;++i){
            System.out.printf("Printing the EMI for LoanClass is : %.2f%n", lc[i].getEmi());
        }
    }
}