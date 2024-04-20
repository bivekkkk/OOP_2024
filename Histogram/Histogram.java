package Histogram;

import java.util.Scanner;
import java.util.ArrayList;
public class Histogram {

    public static char[] convert(ArrayList<Character> ast) {
        char[] array = new char[ast.size()];
        for (int i = 0; i < ast.size(); i++) {
            array[i] = ast.get(i);
        }
        return array; 
    }

    public static void main(String[] args) {

        final int HISTOGRAM_NUMBERS = 10;
        
        ArrayList<Character> ast1 = new ArrayList<Character>();
        ArrayList<Character> ast2 = new ArrayList<Character>();
        ArrayList<Character> ast3 = new ArrayList<Character>();
        ArrayList<Character> ast4 = new ArrayList<Character>();
        ArrayList<Character> ast5 = new ArrayList<Character>();
        ArrayList<Character> ast6 = new ArrayList<Character>();
        ArrayList<Character> ast7 = new ArrayList<Character>();
        ArrayList<Character> ast8 = new ArrayList<Character>();
        ArrayList<Character> ast9 = new ArrayList<Character>();
        ArrayList<Character> ast10 = new ArrayList<Character>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < HISTOGRAM_NUMBERS; i++){
        
            System.out.println("Enter a number between 1 and 100");
            int x = input.nextInt();

            if (x > 0 && x <= 10){
                ast1.add('*');
            }

            else if (x > 10 && x <= 20){
                ast2.add('*');
            }
            
            else if (x > 20 && x <= 30){
                ast3.add('*');
            }
            
            else if (x > 30 && x <= 40){
                ast4.add('*');
            }
            
            else if (x > 40 && x <= 50){
                ast5.add('*');   
            }

            else if (x > 50 && x <= 60){
                ast6.add('*');
            }
            
            else if (x > 60 && x <= 70){
                ast7.add('*');
            }
            
            else if (x > 70 && x <= 80){
                ast8.add('*');
            }

            else if (x > 80 && x <= 90){
                ast9.add('*');
            }

            else if (x > 90 && x <= 100){
                ast10.add('*');
            }

            else {
                i--;
            }

        }

        input.close();
        System.out.println();
        System.out.println("1-10\t" + " | " + String.valueOf(convert(ast1)));
        System.out.println("11-20\t" + " | " + String.valueOf(convert(ast2)));
        System.out.println("21-30\t" + " | " + String.valueOf(convert(ast3)));
        System.out.println("31-40\t" + " | " + String.valueOf(convert(ast4)));
        System.out.println("41-50\t" + " | " + String.valueOf(convert(ast5)));
        System.out.println("51-60\t" + " | " + String.valueOf(convert(ast6)));
        System.out.println("61-70\t" + " | " + String.valueOf(convert(ast7)));
        System.out.println("71-80\t" + " | " + String.valueOf(convert(ast8)));
        System.out.println("81-90\t" + " | " + String.valueOf(convert(ast9)));
        System.out.println("91-100\t" + " | " + String.valueOf(convert(ast10)));
        
    }

}
