import java.util.Scanner;

public class ReverseString {



    public static void main(String[] args) {
        String str;
        System.out.println("Enter your string: ");
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.printf("%s",str.charAt(i));
        }

    }


}

