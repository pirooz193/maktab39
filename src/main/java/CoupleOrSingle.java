import java.util.Scanner;

public class CoupleOrSingle {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number : ");
        int number = scanner.nextInt();
        if (number % 2 == 0) System.out.printf("It's a couple number.");
        else System.out.printf("It's a single number .");
    }
}
