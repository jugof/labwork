package loan;

public class HomeLoan extends LoanClass {

    private double limit;

    public HomeLoan(double p, float pr) {
        super(p, pr);
        limit = 750000;
    }
    
    public float getRate() {
        double rate=0;
        if(principle > limit){
            rate = 0.01;
        }
        return (float) (principle < 20000000 ? 0.1+rate : 0.11+rate);
    }
}
