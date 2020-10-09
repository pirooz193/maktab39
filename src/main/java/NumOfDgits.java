import java.util.Scanner;

public class NumOfDgits {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, cntr = 0, num;
        System.out.printf("ENTER A NUMBER : ");
        number = scanner.nextInt();
        for (; ; ) {
            number = number / 10;
            cntr++;
            if (number == 0) break;
        }
        System.out.println(cntr);
    }

}
