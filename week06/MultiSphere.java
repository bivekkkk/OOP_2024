package week06;

public class MultiSphere {
 public static void main(String[] args) {
     // Instantiate two Sphere objects with different diameters
     Sphere sphere1 = new Sphere(3.0);
     Sphere sphere2 = new Sphere(5.0);

     // Display information about Sphere 1
     System.out.println("Sphere 1: " + sphere1);
     System.out.println("Volume of Sphere 1: " + sphere1.calculateVolume()); // Calculate and print the volume of Sphere 1
     System.out.println("Surface Area of Sphere 1: " + sphere1.calculateSurfaceArea()); // Calculate and print the surface area of Sphere 1

     // Display information about Sphere 2
     System.out.println("Sphere 2: " + sphere2);
     System.out.println("Volume of Sphere 2: " + sphere2.calculateVolume()); // Calculate and print the volume of Sphere 2
     System.out.println("Surface Area of Sphere 2: " + sphere2.calculateSurfaceArea()); // Calculate and print the surface area of Sphere 2
 }
}

