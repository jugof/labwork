class Employee{
    private double hours;
    private float rate;

    public Employee(double h, float r){
        hours = h;
        rate = r;
    }

    public Employee(){
        this(0,0);
    }

    public double income(){
        double income = hours * rate;
        double ot = hours - 150;
        if( ot > 0 )
            income += (rate+30) * ot;
        return income;
    }

    public void setHours(double h){
        hours = h;
    }

    public double getHours(){
        return hours;
    }

    public void setRate(float r){
        rate = r;
    }

    public float getRate(){
        return rate;
    }
}