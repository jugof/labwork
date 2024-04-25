package loan;

/**
 * LoanClass
 */
public abstract class LoanClass {

    protected double principle;
    protected float period;

    public LoanClass(double p, float r) {
        principle = p;
        period = r;
    }

    public double getPrinciple(){
        return principle;
    }

    public void setPrinciple(double p){
        principle = p;
    }

    public float getPeriod(){
        return period;
    }

    public void setPeriod(float p){
        period = p;
    }

    public abstract float getRate();

    public double getEmi(){
        double emi = principle * (1 + getRate() * period / 100) / (12 * period);
        return emi;
    }
}