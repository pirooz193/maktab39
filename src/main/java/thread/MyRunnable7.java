package thread;

public class MyRunnable7 implements  Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 100 ; i++) {
            System.out.println(i);
        }
    }
}
