import java.util.Arrays;
import java.util.Scanner;

public class FibonatchiString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int num = scanner.nextInt();
        int[] array = new  int[num];
        int[] array1 = new  int[num];
        for (int i = 1; i <= num ; i++) {
            array[i-1] = i ;
            array1[i -1] = fibonatchi(i);


        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
        for (int i = 0; i < num ; i++) {
            boolean flag = false;
            for (int j = 1; j < num; j++) {
                if ( array[i] == array1[j]) {

                    flag = true;
                    break;
                }

            }

            if (flag)System.out.printf("+");

           else System.out.printf("-");
        }


    }
    public static int fibonatchi(int number) {

        if ((number == 0) || (number == 1))
            return number;

        else

            return fibonatchi(number - 1) + fibonatchi(number - 2);
    }
}
