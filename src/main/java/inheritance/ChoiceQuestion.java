package inheritance;

import java.util.ArrayList;

public class ChoiceQuestion extends Question {
    private ArrayList<String> choices;

    public ChoiceQuestion() {
        this.choices = new ArrayList<String>();
    }

    public void addChoice(String choice, boolean correct) {
        choices.add(choice);
        if (correct) {
            String choiceString = "" + choices.size();
            this.setAnswer(choiceString);
        }
    }

    @Override
    public void display() {
        super.display();
        for (int i = 0; i < this.choices.size(); i++) {
            int choiceNumber = i + 1;
            System.out.println(choiceNumber + ": " + choices.get(i));
        }
    } //end of display()...
}
