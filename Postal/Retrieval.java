package Postal;

import java.util.Scanner;

public class Retrieval {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Details det = new Details();
        // PostOffice[] obj = det.getPo();
        try{
            while(true) {
                System.out.println("Enter name and postal code");
                String details = scan.nextLine();

                String firstName, lastName, postalCode;
                firstName = details.split("\t")[0];
                lastName = details.split("\t")[1];
                postalCode = details.split("\t")[2];
                
                det.setPo(firstName, lastName, postalCode);
                break;
            }
        }

        catch (Exception e) {
            System.out.println("Enter values correctly!\n");
        }
        // System.out.println(det.getPo(5)); //For displaying the user entered value only
        
        det.display(); //For displaying all values
        scan.close();
    }
    
}
