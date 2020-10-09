package thread.execute;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecuteExample3 {

    public static void main(String[] args) {

        Runnable task = () -> System.out.println("once time!");

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);

        scheduledExecutorService.schedule(task, 3, TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();

    }
}
