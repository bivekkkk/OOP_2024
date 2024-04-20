package Quiz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private FileWriter file;
    protected int marks;
    protected ArrayList<String> que;
    protected ArrayList<String> ans;

    public Quiz() throws IOException {
        que = new ArrayList<String>();
        ans = new ArrayList<String>();
    }
 
    public void addQuiz(String question) {
        que.add(question);
    }

    public void addAnswer(String answer) {
        ans.add(answer);
    }

    protected void addToQuizFile(ArrayList<String> que, ArrayList<String> ans) throws IOException {
        file = new FileWriter("questions.csv");
        for (int i = 0; i < que.size(); i++) {
            file.append(que.get(i) + "," + ans.get(i) + "\n");
        }
        file.close();
    }

    protected boolean fileExists() {
        File f = new File("questions.csv");
        return f.exists() && !f.isDirectory();
    }

    protected void readFromQuizFile() throws IOException {
        File f = new File("questions.csv");
        Scanner scanner = new Scanner(f);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            addQuiz(parts[0]);
            addAnswer(parts[1]);
        }
        scanner.close();
    }
}
