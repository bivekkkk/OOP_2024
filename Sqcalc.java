import java.util.Scanner;

class Sqcalc {

    public static void main(String [] args){

        int length;
        int area, perimeter;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of square");

        length = scan.nextInt();

        area = length*length;
        perimeter = 2*(length+length);

        System.out.println("Area :"+area + " and perimeter :" + perimeter);

    }
}