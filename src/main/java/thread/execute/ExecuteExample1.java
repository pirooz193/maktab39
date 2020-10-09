package thread.execute;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ExecuteExample1 {

    public static void main(String[] args){

        ExecutorService  executorService = Executors.newFixedThreadPool(2);

        Runnable runnable = ()-> {
            System.out.println( "inside "+Thread.currentThread().getName());
            for (int i = 0; i < 10 ; i++) {
                System.out.println(i);
            }
        };

        IntStream.range(0,3).forEach(item -> executorService.execute(runnable));

    }
}
