package Quiz;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuizTime {

    public static void main(String[] args) throws IOException {

        System.out.print("\033[H\033[2J");

        Questions obj = new Questions();
        int que = obj.getNumQuestions();

        Integer[] intArray = new Integer[que];

        for (int i = 0; i < que; i++) {
            intArray[i] = i;
        }

        List<Integer> intList = Arrays.asList(intArray);
        Collections.shuffle(intList);
        intList.toArray(intArray);
 
        System.out.println();

        for (int i : intList) {
            obj.showQuestion(i);
            obj.askAnswer(i);
        }

        obj.showResult();

    }
}
