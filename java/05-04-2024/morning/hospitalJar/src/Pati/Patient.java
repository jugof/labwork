package Pati;


public class Patient {
      int patientId;
      protected String patientName;
      protected int bed;
      protected int noOfDays;
      static int count=100;

      public Patient(){
        patientId = ++count;
        bed = 1;
      }

     public void setPatientName(String name){
        patientName = name;
     }

     public String getPatientName(){
        return patientName;
     }

     public void setBedType(int b){
         bed = b;
        }

     public int getBedType(){
        return bed;
     }

     public void setNoOfDays(int days){
        noOfDays = days;
     }

     public int getNoOfDays(){
        return noOfDays;
     }

     public double getPricePerDay(){
        double price = 0;
        switch(bed){
            case 3 :price = 500;
                            break;
            case 2 : price = 350;
                            break;
            default : price = 200;
        }
        return price;
     }

     public double getBillAmount(){
        double amount = noOfDays * getPricePerDay();
        return amount;
     }  
}
