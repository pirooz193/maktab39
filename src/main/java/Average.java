import java.util.Scanner;

public class Average {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num1 = 0;
        float average = 0;
        int number = scanner.nextInt();
        for (int i = 0; i < number ; i++) {
            num1 = scanner.nextFloat();
            average += (num1)/number;
        }
        System.out.printf("%.1f", average);
    }

}
