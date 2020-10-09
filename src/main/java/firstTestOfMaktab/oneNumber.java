package firstTestOfMaktab;

import java.util.Scanner;

public class oneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), sum = 0;
        int flag = 0;

        while ( flag == 0) {
            sum = 0;
            while ( num > 0){
                int x = num % 10;
                num /= 10;
                sum += x;
            }

            if ( sum < 10) {
                flag = 1;
                break;

            } if (num == 0) num = sum;

        }  System.out.println(sum);


    }
}
