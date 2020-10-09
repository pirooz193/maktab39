import java.util.Scanner;

public class MinDistanceOfDigits {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter Number Of Digits : ");
        int numberOfDigits = scanner.nextInt();
        int[] nums = new int[numberOfDigits];
        int min = 0, m = 0;
        System.out.printf("Enter Numbers : ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] - nums[j];
                if (Math.abs(sum) < min || min == 0) min = Math.abs(sum);
            }
        }
        System.out.printf("MinDistance: %d",min);
    }
}
