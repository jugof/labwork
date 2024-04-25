package loan;

public class PersonalLoan extends LoanClass implements Taxable {


    public PersonalLoan(double p, float pr) {
        super(p, pr);
    }
    
    public float getRate() {
        return (float) (principle < 500000 ? 0.15 : 0.16); 
    }
    
    public double getTax() {
        return getEmi() + 100 / 0.9;
    }

}
