import java.util.Scanner;

public class RepeatLetter {


    public static int letterCounter(String[] args) {

        System.out.println("Enter Your  string :");
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();

        int wordCount = 0 , letterCounter = 0;

        //find char in string
        for (char letter = 'a'; letter <= 'z'; letter++) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == letter) {
                    wordCount++;
                }
            }
            //print the count of char
            if (wordCount > 0) {
                System.out.println(letter + "=" + wordCount);
                letterCounter = wordCount;
                wordCount = 0;
            }

        }
        return letterCounter;

    }
}
