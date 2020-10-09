import java.util.Scanner;

public class MonySmallChanging {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money, cntr50 = 0, cntr10 = 0, cntr5 = 0, cntr2 = 0, cntr1 = 0;
        System.out.printf("Enter your Money : ");
        money = scanner.nextInt();
        while (money >= 50) {
            money -= 50;
            cntr50++;
        }
        while (money >= 10) {
            money -= 10;
            cntr10++;
        }
        while (money >= 5) {
            money -= 5;
            cntr5++;
        }
        while (money >= 2) {
            money -= 2;
            cntr2++;
        }
        while (money >= 1) {
            money -= 1;
            cntr1++;
        }
        System.out.printf("%d $50\n%d $10\n%d $5\n%d $2\n%d $1", cntr50, cntr10, cntr5, cntr2, cntr1);


    }
}
