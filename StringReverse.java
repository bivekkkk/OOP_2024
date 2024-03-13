import java.util.Scanner;


public class StringReverse {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user

        Scanner scanner = new Scanner(System.in);


        // Prompt the user to enter a sentence

        System.out.print("Enter a sentence: ");

        String sentence = scanner.nextLine();


        // Close the first scanner to avoid resource leak

        scanner.close();


        // Split the sentence into words

        String[] words = sentence.split(" ");


        // Iterate through each word and reverse its characters

        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {

            StringBuilder reversedWord = new StringBuilder(word);

            reversedWord.reverse();

            reversedSentence.append(reversedWord).append(" ");

        }


        // Print the reversed sentence

        System.out.println("Reversed sentence: " + reversedSentence.toString().trim());

    }

}
