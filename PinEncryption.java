import java.util.Random;
import java.util.Scanner;

public class PinEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a 4-digit pin number
        System.out.print("Enter a 4 digit pin number to encrypt: ");
        int pin = scanner.nextInt();

        // Generate random numbers greater than 1000 and less than 65536
        Random random = new Random();
        int random1 = random.nextInt(64536 - 1000) + 1000;
        int random2 = random.nextInt(64536 - 1000) + 1000;

        // Convert pin number to hexadecimal
        String pinHex = Integer.toHexString(pin);

        // Convert random numbers to hexadecimal
        String random1Hex = Integer.toHexString(random1);
        String random2Hex = Integer.toHexString(random2);

        // Encrypt the pin by sandwiching it between the random hexadecimal numbers
        String encryptedPin = random1Hex + pinHex + random2Hex;

        System.out.println("Your encrypted pin number is " + encryptedPin);

        scanner.close();
    }
}
