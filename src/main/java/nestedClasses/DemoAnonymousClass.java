package nestedClasses;

import java.util.Scanner;

public class DemoAnonymousClass {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter capacity for washing machin in pound of laundry >> ");
        int pound = scanner.nextInt();
        Worker washingMachin = new Worker() {
            @Override
            public void work() {
                System.out.println("i get clothes clean");
                System.out.println("and can handle " + pound + " pound of laundry at a time.");
            }
        };
        washingMachin.work();
    }


}
