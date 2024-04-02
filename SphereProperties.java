import java.util.Scanner;

public class SphereProperties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the sphere
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        // Calculate volume
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        // Calculate surface area
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);

        // Print volume and surface area to four decimal places
        System.out.printf("Volume: %.4f\n", volume);
        System.out.printf("Surface Area: %.4f\n", surfaceArea);

        scanner.close();
    }
}
