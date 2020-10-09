import java.util.Scanner;

public class Rectangle {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        int side1, side2, side3;
        System.out.printf("Enter 3 sides of a Rectangle : ");
        side1 = scanner.nextInt();
        side2 = scanner.nextInt();
        side3 = scanner.nextInt();
        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {

            if (side1 == side2 && side1 == side3) System.out.printf("It's a Equilateral Rectangle!");

            else if ((side1 == side2 ) || (side1 == side3 ) || (side2 == side3 )) {
                System.out.printf("It's a Isosceles Rectangle!");
            } else System.out.printf("It's a natural Rectangl");
        }
        else System.out.printf("can Not Be A Rectangle With This Sides You Entered!");


    }


}
