package Quiz;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Questions extends Quiz {

    private Scanner scan, inp;
    private int numQuestions;

    public Questions() throws IOException {
        if (!fileExists()) {
            ask();
        } 
 
        else if (!fileHasContents()) {
            ask();
        } 

        else {
            fileQuiz();
        }
        clearScreen();
    }
    

    private void ask() {
        scan = new Scanner(System.in);
        inp = new Scanner(System.in);

        System.out.println("Enter how many questions you want to do: ");
        numQuestions = inp.nextInt();

        if (numQuestions <= 0 || numQuestions > 25) {
            clearScreen();
            System.out.println("\nValue out of bounds, questions set to 5.");
            numQuestions = 5;
        }

        for (int i = 0; i < numQuestions; i++) {
            System.out.print("\nEnter Question: ");
            addQuiz(scan.nextLine());
            System.out.print("Enter Answer: ");
            addAnswer(scan.nextLine());
        }
        try {
            addToQuizFile(que, ans);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void fileQuiz() {
        try {
            readFromQuizFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        numQuestions = que.size(); // Set the number of questions based on the file
    }

    private boolean fileHasContents() {
        return new File("questions.csv").length() > 0; // Check if file has contents
    }
    
    private void clearScreen() {
        // Clear screen using ANSI escape code
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void display() {
        for (int i = 0; i < numQuestions; i++) {
            System.out.println(que.get(i) + " " + ans.get(i));
        }
    }

    public void showQuestion(int x) {
        System.out.print("\nQuestion no. 1: " + que.get(x));
    }

    public void askAnswer(int x) {

        scan = new Scanner(System.in);
        System.out.print("\nEnter answer: ");
        String answer = scan.nextLine();

        if (ans.get(x).toLowerCase().equals(answer.toLowerCase())) {
            marks++;
        }
    }

    public void showResult() {

        System.out.println();
        System.out.println("Total Marks: " + marks + "/" + numQuestions);
        System.out.println("Total percentage: " + ((double) marks/numQuestions * 100) + "%");

    }

    public int getNumQuestions() {
        return numQuestions;
    }

}
