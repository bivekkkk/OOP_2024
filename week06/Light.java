package week06;

public class Light {
    public static void main(String[] args) {
        // Instantiate some Bulb objects
        Bulb bulb1 = new Bulb();
        Bulb bulb2 = new Bulb();

        // Turn on bulb1
        bulb1.turnOn();

        // Check if bulb1 is on and print the status
        if (bulb1.isOn()) {
            System.out.println("Bulb 1 is on.");
        } else {
            System.out.println("Bulb 1 is off.");
        }

        // Check if bulb2 is on and print the status
        if (bulb2.isOn()) {
            System.out.println("Bulb 2 is on.");
        } else {
            System.out.println("Bulb 2 is off.");
        }
    }
}