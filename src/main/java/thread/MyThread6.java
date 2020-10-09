package thread;

public class MyThread6 extends  Thread {
    @Override
    public void run(){
        for (char c = 'A'; c <= 'Z' ; c++){
            System.out.println(c);
        }
    }
}
