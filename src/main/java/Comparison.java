import java.util.Scanner;

public class Comparison {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number : ");
        int number;
        number = scanner.nextInt();
        if (number > 10 && number < 20) System.out.printf("Well Done!\nit's between 10 to 20 !");
        else System.out.printf("Sorry ! It's not between 10 to 20 ! ");
    }

}
