package MAP;

public class PublicTransport implements  RouteStrategy {


    @Override
    public void buildRoute(int a, int b) {
        System.out.println("public");
    }
}
