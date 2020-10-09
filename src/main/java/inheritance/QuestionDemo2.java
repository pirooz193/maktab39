package inheritance;

import java.util.Scanner;

public class QuestionDemo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ChoiceQuestion cq1 = new ChoiceQuestion();

        cq1.setText("Iran Capital??");
        cq1.addChoice("Paris", false);
        cq1.addChoice("London", false);
        cq1.addChoice("Tehran", true);

        cq1.display();
        System.out.println("Enter the answer: ");

        String userResponse = in.next();
        boolean result = cq1.checkAnswer(userResponse);
        System.out.println("Your answer was : " + result);
    }
}
