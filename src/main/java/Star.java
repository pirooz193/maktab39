import java.util.Scanner;

public class Star {


    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        for (int i = num -1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
