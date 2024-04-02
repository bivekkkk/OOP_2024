package week06;

import java.util.Random;

public class CardDealer {
    public static void main(String[] args) {
        // Arrays to hold possible suits and face values
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] faceValues = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        // Random object to generate random indices
        Random random = new Random();

        // Deal five random cards
        System.out.println("Dealing five random cards:");
        for (int i = 0; i < 5; i++) {
            // Generate random indices for suit and face value
            int suitIndex = random.nextInt(suits.length);
            int faceValueIndex = random.nextInt(faceValues.length);

            // Create a new Card object with the random suit and face value
            Card card = new Card(suits[suitIndex], faceValues[faceValueIndex]);

            // Display the dealt card
            System.out.println("Card " + (i + 1) + ": " + card);
        }
    }
}
