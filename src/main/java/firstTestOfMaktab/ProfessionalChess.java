import java.util.Scanner;

public class ProfessionalChess {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[6];
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }

        if (num[0] > 1) System.out.printf("%d ", 1 - num[0]);
        else if (num[0] < 1) System.out.printf("%d ",  1 -num[0]);
        else System.out.printf("%0 ");

        if (num[1] > 1) System.out.printf("%d ", 1 - num[1]);
        else if (num[0] < 1) System.out.printf("%d ",  1 - num[1]);
        else System.out.printf("%0 ");

        if (num[2] > 2) System.out.printf("%d ", 2 - num[2]);
        else if (num[0] < 2) System.out.printf("%d ",2 - num[2]);
        else System.out.printf("%0 ");

        if (num[3] > 2) System.out.printf("%d ", 2 - num[3]);
        else if (num[0] < 2) System.out.printf("%d " ,  2 -  num[3] );
        else System.out.printf("%0 ");

        if (num[4] > 2) System.out.printf("%d ", 2 - num[4]);
        else if (num[0] < 2) System.out.printf("%d ",  2 - num[4]);
        else System.out.printf("%0 ");

        if (num[5] > 8) System.out.printf("%d ", 8 - num[5] );
        else if (num[0] < 8) System.out.printf("%d ", 8 -num[5]);
        else System.out.printf("%0");


    }


}
