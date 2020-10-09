import java.util.Scanner;

public class Delivery {

//bayad fekr she
//

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int flag = 0;
        System.out.printf("ENTER NUM OF NUMBERS : ");

        int numOfDigits = scanner.nextInt(), num;
        float[] numbers = new float[numOfDigits];
        System.out.printf("ENTER NUMBERS ( IF YOU WANNA STOP! ENTER -1 IN THE END OF NUMBERS ) : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }


        while (flag == 0) {

            float max = 0, min = 0;
            float average = 0;

            num = scanner.nextInt();
            if (numbers[numOfDigits - 1] == -1) numOfDigits = numbers.length - 1;
            switch (num) {

                case 1:
                    for (int i = 0; i < numbers.length; i++) {
                        average += (numbers[i]) / numOfDigits;
                    }
                    System.out.println(average);
                    break;


                case 2:
                    max = numbers[0];
                    for (int i = 0; i < numOfDigits; i++) {
                       if (numbers[i] > max) max = numbers[i];

                    }
                    System.out.println(max);
                    break;


                case 3:
                    min = numbers[0];

                    for (int i = 1; i < numbers.length ; i++) {
                       if (numbers[i]<min)min = numbers[i];

                    }
                    System.out.println(min);
                    break;


                case 4:

                    continue;

            }





        }
        System.out.println("GOODBYE!");


    }

    public  static void menu(){
        System.out.println("OP \" 1 \" --> AVERAGE OF NUMBERS AND SHOWING DELIVERY ");
        System.out.println("OP \" 2 \" --> MAX OF NUMBERS AND SHOWING DELIVERY ");
        System.out.println("OP \" 3 \" --> MIN OF NUMBERS AND SHOWING DELIVERY ");
        System.out.println("OP \" 4 \" --> NEW NUMBERS !");
        System.out.println("WHAT DO YOU WANT TO DO ? : ");

    }


}
