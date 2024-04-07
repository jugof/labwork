import Pati.Patient;

public class program {
    public static void main(String[] args) {
       
        Patient juned = new Patient();

        juned.setPatientName("JUNAID");
        juned.setNoOfDays(10);
        juned.setBedType(3);
        
        System.out.printf("Total bill will be for Juned is : %.2f%n ", juned.getBillAmount());

    }
}
