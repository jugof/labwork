class InHousePatient : Patient
{
    public double discount { get; set; }

    // discount = getBillAmount() > 5000 ? discount : 0.5;

    public override double getBillAmount(){
        double amount = base.getBillAmount();
        if(base.getBillAmount() < 5000){
            discount = 0.05;
        }
        amount *= discount;
        return base.getPricePerDay() * noOfDays - amount;
    }
}
