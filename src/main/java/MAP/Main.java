package MAP;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner( System.in);
        RouteStrategy routeStrategy = null;
        int i = s.nextInt();
        switch (i){
            case 1 :
                routeStrategy = new Road();
                break;
            case 2:

                routeStrategy = new Walking();
                break;
        }
        routeStrategy.buildRoute(1,2);
    }
}
