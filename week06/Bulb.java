package week06;

class Bulb {
    private boolean isOn; // Indicates whether the bulb is on or off

    // Constructor to initialize the bulb as off
    public Bulb() {
        isOn = false;
    }

    // Method to turn on the bulb
    public void turnOn() {
        isOn = true;
    }

    // Method to turn off the bulb
    public void turnOff() {
        isOn = false;
    }

    // Method to check if the bulb is on
    public boolean isOn() {
        return isOn;
    }
}
