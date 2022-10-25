import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Hello from run()");
        }
    }
}
public class ThreadPool
{
    public static void main(String[] args)
    {
        System.out.println("Single Pool");
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++)
        {
            executorService.execute(new Task());
        }

        System.out.println("Fixed Pool");
        ExecutorService executorService1 = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 5; i++)
        {
            executorService1.execute(new Task());
        }

        System.out.println("Cache Pool");
        ExecutorService executorService2 = Executors.newCachedThreadPool();
        executorService2.execute(new Task());
        for (int i = 0; i < 5; i++)
        {
            executorService2.execute(new Task());
        }

        System.out.println("Scheduled Pool");
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);
        scheduledExecutorService.schedule(new Task(),10, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(new Task(),3,2,TimeUnit.SECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(new Task(),3,2,TimeUnit.SECONDS);


    }
}
