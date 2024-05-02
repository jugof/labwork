using System;

class Program
{
    public static void Main(string[] args){
        Patient p = new Patient();
        p.bedType = Bed.Executive;
        p.noOfDays = 10;
        p.patientName = "Jack";
        Console.WriteLine("Number of days is : {0}",p.noOfDays);
        Console.WriteLine("For patient - {0} Total Amount is : {1:0.00}",p.patientName, p.getBillAmount());

        Console.WriteLine("---------------------------------");
        
        InHousePatient b = new InHousePatient();
        b.bedType = Bed.Executive;
        b.noOfDays = 20;
        b.patientName = "Jill";
        b.discount = 0.12;
         Console.WriteLine("Patient name is : {0}",b.patientName);
        Console.WriteLine("Number of days is : {0}",b.noOfDays);
        Console.WriteLine("Total Amount for the Patient is : {0:0.00}", b.getBillAmount());
    }
}