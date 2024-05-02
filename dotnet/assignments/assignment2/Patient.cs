
class Patient
{
    public string patientName{get; set; }

    private static long count = 10000;
    public long patientId = ++count;

    

    public Bed bedType{get; set; }

    public int noOfDays{ get; set; }

    public double getPricePerDay(){
        double price=0;
        switch (bedType){
            case Bed.Executive : price = 500;
                                break;
            case Bed.Special : price = 350;
                                break;
            default : price = 200;
                    break;
        }
        return price;
    }

    public virtual double getBillAmount(){
        return noOfDays * getPricePerDay();
    }
}