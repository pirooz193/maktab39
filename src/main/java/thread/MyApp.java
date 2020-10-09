package thread;


public class MyApp {


    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new MyThread1();
        Thread thread2 = new MyThread2();
        Thread thread3 = new MyThread3();
//        thread.run();
//        thread1.start();
//        thread1.join();
//
//        thread2.start();
//        thread3.setPriority(10);
//        thread3.start();

        System.out.println("after starting . . .");

//        Runnable runnable =new MyRunnable4();
        MyRunnable4 thread4 = new MyRunnable4();
        Thread thread = new Thread(thread4);
//        thread.start();

        Runnable runnable = () -> System.out.println("inside runnable5");
        Runnable myRunnable5 = new MyRunnable5();
        Thread  thread5 = new Thread(myRunnable5);
//        Thread  thread6 = new Thread(runnable);
//        thread5.start();


        Runnable runnable7 =  new MyRunnable7();
        Thread thread6 =  new Thread(runnable7);
        thread6.start();


        MyThread6 myThread6= new MyThread6();
        myThread6.start();

    }
}
