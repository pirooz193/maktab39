package inheritance;
import java.util.Scanner;

public class QuestionDemo1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        Question q1 = new Question();
        q1.setText("Who was the inventor of Java?");
        q1.setAnswer("James Gosling");

        q1.display();

        System.out.println("Your Answer: ");
        String response = in.nextLine();
        System.out.println(q1.checkAnswer(response));
    }
}
