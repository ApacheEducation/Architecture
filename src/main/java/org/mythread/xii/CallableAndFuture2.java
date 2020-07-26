package org.mythread.xii;

import java.util.Random;
import java.util.concurrent.*;

/**
 * Created by yanghai on 16-5-14.
 */
public class CallableAndFuture2 {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        Future<Integer> future = threadPool.submit(new Callable<Integer>() {
            public Integer call() throws Exception {
                Thread.sleep(2000);
                return new Random().nextInt(100);
            }
        });
        threadPool.shutdown();
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
