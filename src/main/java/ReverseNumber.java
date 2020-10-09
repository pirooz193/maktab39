import java.util.Scanner;

public class ReverseNumber {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("ENTER A NUMBER : ");
        int number = scanner.nextInt(), cntr = 0, num;

        for (; ; ) {
            num = number % 10;
            number = number / 10;
            System.out.printf("%d", num);
            if (number == 0) break;
        }

    }
}
