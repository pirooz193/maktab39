import java.util.Scanner;

public class ReversePrint {


    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[] nums = new int[1000];

            for (int i = 0; i < nums.length ; i++) {
                    nums[i]= scanner.nextInt();
                 if ( nums[i] == 0){
                    for (int j = 0; j < i  ; i--) {
                        System.out.printf("%d\n",nums[i-1]);
                    }
                    break;
                }
            }


    }

}
