package inheritance;

public class Question {
    private String text;
    private String answer;

    //Constructor
    public Question() {
        this.text = ""; //empty String
        this.answer = "";
    }

    public void setText(String questionText) {
        this.text = questionText;
    }

    public void setAnswer(String correctResponse) {
        this.answer = correctResponse;
    }

    public boolean checkAnswer(String response) {
        return response.equals(this.answer);
    }

    public void display() {
        System.out.println(this.text);
    }

}
