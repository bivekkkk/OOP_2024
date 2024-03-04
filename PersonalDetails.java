import java.util.Scanner;

class PersonalDetails {
    public static void main(String[] args) {
        String name, address;
        int age;
        long ph_number; // Changed the data type to long for phone number

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        name = scan.nextLine();
        System.out.println("Enter your address: ");
        address = scan.nextLine();
        System.out.println("Enter your age: ");
        age = scan.nextInt();
        scan.nextLine(); // Consume newline character
        System.out.println("Enter your phone number: ");
        ph_number = Long.parseLong(scan.nextLine());
        System.out.println("Name : " + name + "\nAddress: " + address + "\nAge: " + age + "\nPhone number: " + ph_number);

        scan.close();
    }
}
