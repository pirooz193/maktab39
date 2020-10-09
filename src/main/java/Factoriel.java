import java.util.Scanner;

public class Factoriel {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number : ");
        long number = scanner.nextInt();
        System.out.println( factoriel(number));
    }

    public static long factoriel(long number) {
        if (number == 0 || number == 1) return 1;
        return number * factoriel(number - 1);
    }
}
