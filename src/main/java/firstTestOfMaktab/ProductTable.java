import java.util.Scanner;

public class ProductTable {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt() ,sum = 0;
        for (int i = 1; i < num +1; i++) {
            for (int j = 0; j < num ; j++) {
                sum = i+ i*(j);
                System.out.printf( "%d ",sum);
            }
            System.out.println();

        }
    }
}
