import java.util.Scanner;

public class miletokm {

    public static void main(String [] args){

        double mile_to_km, value;

        mile_to_km = 1.60935 ; //1 mile == 1.60935 km

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter miles to convert to kilometer");
        value = scan.nextInt();

        double kilometers;

        kilometers = value * mile_to_km;

        System.out.println(value +"miles = " + kilometers +" kilometers");


    }
}