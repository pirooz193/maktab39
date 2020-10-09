package HW4;

import java.util.Scanner;

public class TizpaOnlineTaxi {
    int[][] district = {{1, 2, 2, 2, 4, 3}, {2, 1, 4, 2, 3}, {3, 5, 1, 3, 2}, {4, 3, 3, 1, 2}, {3, 3, 2, 2, 1}};
    final int economic = 5000;
    final int special = 10000;
    final int motor = 4000;
    double[] rainy = {1.2, 2, 0.8};
    double[] rainyWithTraffic = {1.4, 3, 1.5};
    double[] traffic = {1.2, 2, 2};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start, end;
        double fare = 0;
        System.out.println("WELCOM TO TIZPA ONLINETAXI");
        System.out.printf("District You Are Now:");
        start = scanner.nextInt();
        System.out.printf("District You Wanna Go:");
        end = scanner.nextInt();
        TizpaOnlineTaxi tizpaOnlineTaxi = new TizpaOnlineTaxi();
        taxiTypeMenu();
        int type = scanner.nextInt();
        wayMenu();
        int way = scanner.nextInt();
        switch (type) {
            case 1:
                if (way == 1)
                    fare = tizpaOnlineTaxi.district[start][end] * tizpaOnlineTaxi.economic * tizpaOnlineTaxi.rainy[way - 1];
                if (way == 2)
                    fare = tizpaOnlineTaxi.district[start][end] * tizpaOnlineTaxi.economic * tizpaOnlineTaxi.rainyWithTraffic[way - 1];
                if (way == 3)
                    fare = tizpaOnlineTaxi.district[start][end] * tizpaOnlineTaxi.economic * tizpaOnlineTaxi.traffic[way - 1];
                break;
            case 2:
                if (way == 1)
                    fare = tizpaOnlineTaxi.district[start][end] * tizpaOnlineTaxi.special * tizpaOnlineTaxi.rainy[way - 1];
                if (way == 2)
                    fare = tizpaOnlineTaxi.district[start][end] * tizpaOnlineTaxi.special * tizpaOnlineTaxi.rainyWithTraffic[way - 1];
                if (way == 3)
                    fare = tizpaOnlineTaxi.district[start][end] * tizpaOnlineTaxi.special * tizpaOnlineTaxi.traffic[way - 1];
                break;
            case 3:
                if (way == 1)
                    fare = tizpaOnlineTaxi.district[start][end] * tizpaOnlineTaxi.motor * tizpaOnlineTaxi.rainy[way - 1];
                if (way == 2)
                    fare = tizpaOnlineTaxi.district[start][end] * tizpaOnlineTaxi.motor * tizpaOnlineTaxi.rainyWithTraffic[way - 1];
                if (way == 3)
                    fare = tizpaOnlineTaxi.district[start][end] * tizpaOnlineTaxi.motor * tizpaOnlineTaxi.traffic[way - 1];
                break;

        }

        System.out.println("Fare : " + fare);

    }


    public static void taxiTypeMenu() {
        System.out.println("Select Type Of Taxi : (Enter It's Number)");
        System.out.println("1.economic\n2.Special\n3.Motor");
    }

    public static void wayMenu() {
        System.out.println("Select Weather :");
        System.out.println("1.Rainy\n2.Rainy And Traffic\n3.Traffic");
    }


}
