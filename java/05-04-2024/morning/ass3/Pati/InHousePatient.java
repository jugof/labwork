import Pati.Patient;

public class InHousePatient extends Patient{
    
    private int discount;

    public int getDiscount(){
        return discount;
    }

    public void setDiscount(int dis){
        discount = dis;
    }

    public double getBillAmount(){
        if(noOfDays * getPricePerDay() > 5000){
            return noOfDays * getPricePerDay() * discount;
        }
        return noOfDays * getPricePerDay() * 0.05;
     }
}
