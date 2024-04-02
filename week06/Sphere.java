package week06;

public class Sphere {
    private double diameter; // Instance variable to store the diameter of the sphere

    // Constructor to initialize the diameter of the sphere
    public Sphere(double diameter) {
        this.diameter = diameter;
    }

    // Getter method to retrieve the diameter of the sphere
    public double getDiameter() {
        return diameter;
    }

    // Setter method to set the diameter of the sphere
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    // Method to calculate and return the volume of the sphere
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(diameter / 2.0, 3);
    }

    // Method to calculate and return the surface area of the sphere
    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(diameter / 2.0, 2);
    }

    // toString method to return a string representation of the sphere
    public String toString() {
        return "Sphere [Diameter=" + diameter + "]";
    }
}
