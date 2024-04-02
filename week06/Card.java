package week06;

class Card {
    private String suit;
    private String faceValue;

    // Constructor to initialize a card with suit and face value
    public Card(String suit, String faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    // Getter method for the suit
    public String getSuit() {
        return suit;
    }

    // Getter method for the face value
    public String getFaceValue() {
        return faceValue;
    }

    // Method to return a string representation of the card
    public String toString() {
        return faceValue + " of " + suit;
    }
}
